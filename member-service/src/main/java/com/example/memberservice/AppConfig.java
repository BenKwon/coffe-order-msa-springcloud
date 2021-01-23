package com.example.memberservice;


import com.example.memberservice.repostiory.MemberRepository;
import com.example.memberservice.repostiory.MemoryMemberRepository;
import com.example.memberservice.service.MemberService;
import com.example.memberservice.service.MemberServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

}
