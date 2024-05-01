package com.ohgiraffers.section01.set.run;

import java.util.HashSet;

public class Application1 {

    public static void main(String[] args) {

        /*
        * Set 인터페이스를 구현한 셋 컬렉션 클래스의 특징
        * 1. 요소의 저장 순서를 유지 안함
        * 2. 같은 요소의 중복저장 불허.(null값도 중복 허용 안함)
        *
        * HashSet
        * set 컬렉션 클래스에서 가장 많이 사용되는 클래스
        * jdk 1.2부터 제공되고 있으며 해시 알고리즘을 사용하여 검색속도가 빠름
        *
        * */

        HashSet<String> hset = new HashSet<>();
        hset.add("보통");
        hset.add("강사");
        hset.add("이상우");
        hset.add("이상우");

        System.out.println(hset);

        System.out.println(hset.contains("이상우"));
        System.out.println(hset.size());
        hset.clear();
        System.out.println(hset);

        Object[] arr = hset.toArray();
        System.out.println(arr[1]);

        hset.clear();
        System.out.println(hset);
    }
}
