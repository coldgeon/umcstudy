package com.umc7thex.demo.repository;

import com.umc7thex.demo.domain.Member;
import com.umc7thex.demo.domain.enums.MemberStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
