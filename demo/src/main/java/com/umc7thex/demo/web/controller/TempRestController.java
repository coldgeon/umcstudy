package com.umc7thex.demo.web.controller;

import com.umc7thex.demo.apiPayload.ApiResponse;
import com.umc7thex.demo.converter.TempConverter;
import com.umc7thex.demo.web.dto.TempResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temp")
@RequiredArgsConstructor
public class TempRestController {

    @GetMapping("/test")
    public ApiResponse<TempResponse.TempTestDTO> testAPI() {
        return ApiResponse.onSuccess(TempConverter.toTempTestDTO());
    }
}
