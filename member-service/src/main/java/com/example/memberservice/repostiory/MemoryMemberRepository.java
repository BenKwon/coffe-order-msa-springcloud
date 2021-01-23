package com.example.memberservice.repostiory;

import com.example.memberservice.domain.Grade;
import com.example.memberservice.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class MemoryMemberRepository implements MemberRepository {
    private static Map<Integer, Member> store = new HashMap<>();
    private static Integer sequence = 3;
    static {
        store.put(1, new Member(1,"Ben",Grade.VIP));
        store.put(2, new Member(2,"Tim", Grade.VIP));
        store.put(3, new Member(3,"Elly",Grade.VIP));

    }
    @Override
    public void save(Member member) {
        store.put(++sequence, member);
    }
    
    public ArrayList<Member> allUser(){
        Collection<Member> values = store.values();
        return new ArrayList<Member>(values);
    }
    @Override
    public Member findById(Integer memberId) {
        return store.get(memberId);
    }
}
