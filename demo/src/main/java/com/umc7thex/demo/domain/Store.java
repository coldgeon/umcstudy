package com.umc7thex.demo.domain;

import com.umc7thex.demo.domain.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access= AccessLevel.PROTECTED)
@AllArgsConstructor
public class Store extends BaseEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String score;

    @OneToMany(mappedBy="store", cascade = CascadeType.ALL)
    private List<Review> reviewList = new ArrayList<>();

}
