package com.example.memberservice;

import com.example.memberservice.domain.Grade;
import com.example.memberservice.domain.Member;
import com.example.memberservice.service.MemberService;
import com.netflix.discovery.converters.Auto;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    public MemberService memberService;

    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }
    @Test
    public void joinTest(){
        //given
        Member ben = new Member(4, "ben", Grade.VIP);

        //when
        memberService.join(ben);
        Member member = memberService.findMember(4);

        //then
        Assertions.assertThat(member.getName()).isEqualTo(ben.getName());

    }
}
