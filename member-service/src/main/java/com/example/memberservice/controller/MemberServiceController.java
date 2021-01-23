package com.example.memberservice.controller;

import com.example.memberservice.domain.Member;
import com.example.memberservice.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("member")
public class MemberServiceController {
    private final MemberService memberService;

    @Autowired
    public MemberServiceController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("all")
    private ArrayList<Member> retrieveAllUsers(){
        return memberService.getAllUser();
    }
}
