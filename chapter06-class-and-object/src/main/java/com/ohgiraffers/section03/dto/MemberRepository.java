package com.ohgiraffers.section03.dto;

import java.util.ArrayList;

public class MemberRepository {

    ArrayList data = new ArrayList();


    public void addMember(MemberDto member) {
        data.add(member);
    }
}
