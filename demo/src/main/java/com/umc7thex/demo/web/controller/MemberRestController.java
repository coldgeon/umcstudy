package com.umc7thex.demo.web.controller;

import com.umc7thex.demo.apiPayload.ApiResponse;
import com.umc7thex.demo.service.MemberService.MemberCommandService;
import com.umc7thex.demo.web.dto.MemberRequestDTO;
import com.umc7thex.demo.web.dto.MemberResponseDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberRestController {
    //아직 서비스단 구현 X
    private final MemberCommandService memberCommandService;

    @PostMapping("/")
    public ApiResponse<MemberResponseDTO.JoinResultDTO> join(@RequestBody @Valid MemberRequestDTO.JoinDTO request) {
        return null;
    }
}
