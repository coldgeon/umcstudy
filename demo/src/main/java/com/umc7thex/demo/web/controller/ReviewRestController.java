package com.umc7thex.demo.web.controller;

import com.umc7thex.demo.service.ReviewService;
import com.umc7thex.demo.web.dto.ReviewRequestDTO;
import com.umc7thex.demo.web.dto.ReviewResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reviews")
@RequiredArgsConstructor
public class ReviewRestController {
    private final ReviewService reviewService;

    @PostMapping("/add")
    public ResponseEntity<ReviewResponseDTO> createReview(@RequestBody ReviewRequestDTO reviewRequestDTO) {
        ReviewResponseDTO result = reviewService.addReview(reviewRequestDTO);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(result);
    }
}
