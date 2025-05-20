package com.umc7thex.demo.service;

import com.umc7thex.demo.domain.Member;
import com.umc7thex.demo.domain.Review;
import com.umc7thex.demo.domain.Store;
import com.umc7thex.demo.repository.MemberRepository;
import com.umc7thex.demo.repository.ReviewRepository;
import com.umc7thex.demo.repository.StoreRepository;
import com.umc7thex.demo.web.dto.ReviewRequestDTO;
import com.umc7thex.demo.web.dto.ReviewResponseDTO;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReviewService {
    private final ReviewRepository reviewRepository;
    private final MemberRepository memberRepository;
    private final StoreRepository storeRepository;

    @Transactional
    public ReviewResponseDTO addReview(ReviewRequestDTO dto) {
        Member member = memberRepository.findById(dto.getMemberId())
                .orElseThrow(() -> new EntityNotFoundException("Member not found"));
        Store store = storeRepository.findById(dto.getStoreId())
                .orElseThrow(() -> new EntityNotFoundException("Store not found"));
        Review review = Review.builder()
                .member(member)
                .store(store)
                .body(dto.getBody())
                .score(dto.getScore())
                .build();

        Review saved = reviewRepository.save(review);
        return new ReviewResponseDTO(
                saved.getId(),
                member.getId(),
                store.getId(),
                saved.getBody(),
                saved.getScore(),
                saved.getCreatedAt()

        );


    }
}
