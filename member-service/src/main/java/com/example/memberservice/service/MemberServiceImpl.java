package com.example.memberservice.service;

import com.example.memberservice.domain.Member;
import com.example.memberservice.repostiory.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public ArrayList<Member> getAllUser() {
        return memberRepository.allUser();
    }

    @Override
    public Member findMember(Integer memberId) {
        return memberRepository.findById(memberId);
    }
}
