package com.ohgiraffers.understand.auth.impl;

import com.ohgiraffers.understand.auth.SnsAuth;
import com.ohgiraffers.understand.auth.dto.MemberDTO;

import java.lang.reflect.Member;

public class NaverAuth implements SnsAuth {


    @Override
    public boolean login(MemberDTO member) {
        return true;
    }
}
