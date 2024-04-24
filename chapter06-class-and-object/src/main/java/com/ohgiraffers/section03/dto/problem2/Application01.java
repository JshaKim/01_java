package com.ohgiraffers.section03.dto.problem2;

public class Application01 {

    public static void main(String[] args) {

        MemberDto song = new MemberDto();
        song.setAge(20);
        song.setAddress("인사동");
        song.setGender('여');
        song.setPhone("010-0000-0000");
        song.setName("송재희");

        MemberDto kim = new MemberDto();
        kim.setAge(18);
        kim.setAddress("고잔동");
        kim.setGender('남');
        kim.setPhone("010-0000-1000");
        kim.setName("김재석");

        MemberRepository memberRepository = new MemberRepository();
        memberRepository.addMember(song);
        memberRepository.addMember(kim);
        memberRepository.print();
    }
}
