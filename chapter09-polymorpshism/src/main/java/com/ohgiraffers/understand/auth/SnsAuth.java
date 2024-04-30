package com.ohgiraffers.understand.auth;

import com.ohgiraffers.understand.auth.dto.MemberDTO;

public interface SnsAuth {

    boolean login(MemberDTO member);
}
