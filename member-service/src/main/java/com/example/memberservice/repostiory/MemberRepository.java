package com.example.memberservice.repostiory;

import com.example.memberservice.domain.Member;

import java.util.ArrayList;

public interface MemberRepository {
    void save(Member member);
    ArrayList<Member> allUser();
    Member findById(Integer memberId);
}
