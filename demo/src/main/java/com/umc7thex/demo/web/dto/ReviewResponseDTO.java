package com.umc7thex.demo.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class ReviewResponseDTO {
    private Long reviewId;
    private Long storeId;
    private Long memberId;
    private String body;
    private Float score;
    private LocalDateTime createdAt;

}
