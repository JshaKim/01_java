package com.ohgiraffers.section01.map.run;

import java.util.*;

public class Application01 {

    public static void main(String[] args) {

        /*
        * Map 인터페이스 특징
        * collection 인터페이스와는 다른 저장 방식을 가진다
        * 키와 값을 하나의 쌍으로 저장하는 방식을 사용
        *
        * 키(key)
        * 값(value)를 찾기 위한 이름 역할을 하는 객체
        * 1. 요소와 저장 순서를 유지하지 않음
        * 2. 키는 중복을 불허, 키가 다르면 중복된 값만 저장 가능
        *
        * hashMap, hashTable, treeMap 등의 대표적인 클래스 있음
        * hashMap이 가장 많이 사용, hashTable은 jdk1.8에서 지원
        * hashMap과 동일하게 동작되며 하위 호환을 위해 남겨놓았기 때문에 가급적이면 hashMap을 사용하는 것이 좋다.
        *
        * hashMap jdk1.2부터 제공되는 클래스로 해시 알고리즘을 사용하여 검색 속도가 매우 빠르다.
        *
        *
        * */


        HashMap hmap = new HashMap();
        hmap.put("one", new Date());
        hmap.put(12, "red apple");
        hmap.put(12, 32);
        System.out.println(hmap);
        System.out.println(hmap.get(12));


        HashMap<Integer, String> imap = new HashMap();
        imap.put(1, "2");
        imap.put(1, "10");
        imap.put(1, "A");
        System.out.println(imap);

        Collection<String> values = imap.values();
        System.out.println(values);

    }



}
