package com.umc7thex.demo.converter;

import com.umc7thex.demo.web.dto.TempResponse;

public class TempConverter {
    public static TempResponse.TempTestDTO toTempTestDTO() {
        return TempResponse.TempTestDTO.builder()
                .testString("This is test!")
                .build();
    }
}
