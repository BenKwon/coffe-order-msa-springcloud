package com.example.memberservice.service;

import com.example.memberservice.domain.Member;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface MemberService {
    void join(Member member);
    ArrayList<Member> getAllUser();
    Member findMember(Integer memberId);
}


