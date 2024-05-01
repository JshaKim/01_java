package com.ohgiraffers.section01.set.run;

import com.sun.security.jgss.GSSUtil;

import java.util.TreeSet;

public class Application03 {

    public static void main(String[] args) {
        /**
         * treeSet 클래스
         * treeSet 클래스는 뎀이터가 결정된 상태로 저장되는 이진 검색 트리 형태로 요소를 전달
         * 이진 검색 트리는 데이터를 추가하거나 제거하는 등의 기본 동작 시간이 매우 빠르다
         * jdk 1.2부터 제공
         * Set 인터페이스가 가지는 특징을 그대로 가지지만 정렬된 상태를 유지한다는 것이 다른 점
         *
         */
        TreeSet<String> tset = new TreeSet<>();
        TreeSet<String> tset2 = new TreeSet<>();

        tset.add("A");
        tset.add("b");
        tset.add("c");
        tset.add("d");

        System.out.println(tset);
        System.out.println("teset2!!!!");

        tset2.add("a");
        tset2.add("b");
        tset2.add("c");
        tset2.add("d");
        System.out.println(tset2);


    }
}
