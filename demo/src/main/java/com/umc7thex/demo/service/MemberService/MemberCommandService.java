package com.umc7thex.demo.service.MemberService;

import com.umc7thex.demo.domain.Member;
import com.umc7thex.demo.web.dto.MemberRequestDTO;

public interface MemberCommandService {
    Member joinMember(MemberRequestDTO.JoinDTO request);
}
