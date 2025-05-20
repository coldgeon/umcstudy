package com.umc7thex.demo.service.MemberService;

import com.umc7thex.demo.converter.MemberConverter;
import com.umc7thex.demo.domain.Member;
import com.umc7thex.demo.repository.MemberRepository;
import com.umc7thex.demo.web.dto.MemberRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberCommandServiceImpl implements MemberCommandService {
    private final MemberRepository memberRepository;

    @Override
    public Member joinMember(MemberRequestDTO.JoinDTO request) {
        Member newMember = MemberConverter.toMember(request);
        return null;
    }
}
