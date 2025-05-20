package com.umc7thex.demo.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReviewRequestDTO {
    private Long memberId;
    private Long storeId;
    private String body;
    private Float score;

}
