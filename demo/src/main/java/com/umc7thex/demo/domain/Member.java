package com.umc7thex.demo.domain;

import com.umc7thex.demo.domain.common.BaseEntity;
import com.umc7thex.demo.domain.enums.Gender;
import com.umc7thex.demo.domain.enums.MemberStatus;
import com.umc7thex.demo.domain.enums.SocialType;
import com.umc7thex.demo.domain.mapping.MemberAgree;
import com.umc7thex.demo.domain.mapping.MemberMission;
import com.umc7thex.demo.domain.mapping.MemberPrefer;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access= AccessLevel.PROTECTED)
@AllArgsConstructor
public class Member extends BaseEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false, length = 40)
    private String address;

    @Column(nullable = false, length = 40)
    private String specAddress;

    @Column(columnDefinition = "VARCHAR(10)")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    @Column(
            name = "social_type",
            nullable = false,
            columnDefinition = "ENUM('APPLE','GOOGLE','KAKAO','NAVER')"
    )
    private SocialType socialType;

    @Column(columnDefinition = "VARCHAR(15) DEFAULT 'ACTIVE'")
    @Enumerated(EnumType.STRING)
    private MemberStatus memberStatus;

    private LocalDate inactiveDate;

//    @Column(nullable = false, length = 50)
    private String email;

    private Integer point;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<MemberAgree> memberAgreeList = new ArrayList<>();

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<MemberPrefer> memberPreferList = new ArrayList<>();

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Review> reviewList = new ArrayList<>();

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<MemberMission> memberMission = new ArrayList<>();
    
    

}
