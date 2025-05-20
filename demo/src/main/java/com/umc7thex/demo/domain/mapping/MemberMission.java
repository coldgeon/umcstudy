package com.umc7thex.demo.domain.mapping;

import com.umc7thex.demo.domain.Member;
import com.umc7thex.demo.domain.Mission;
import com.umc7thex.demo.domain.common.BaseEntity;
import com.umc7thex.demo.domain.enums.MissionStatus;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access= AccessLevel.PROTECTED)
@AllArgsConstructor
public class MemberMission extends BaseEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private MissionStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="mission_id")
    private Mission mission;
}
