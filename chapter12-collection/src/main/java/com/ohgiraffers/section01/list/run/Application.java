package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application {

    public static void main(String[] args) {

//        ArrayList aList = new ArrayList();
//
//        List list = new ArrayList();
//
//        Collection clist = new ArrayList();
//
//        aList.add("Abc");
//        aList.add(123);
//        aList.add(58.62);
//        aList.add(new Date());
//
//        System.out.println(aList);
//
//        // list의 길이를 확인할 때 size를 이용한다.
//        System.out.println(aList.size());
//
//        for (int i = 0; i < aList.size(); i++) {
//            //특정 인덱스값을 꺼내온다.
//            System.out.println(aList.size(i));
//        }
//
//        System.out.println("반경테스트");
//        String targer = "사용자 입력값";
//        //특정 인덱스 값 수정
//        aList.add(0, targer);
//        System.out.println(aList.get(0));
//
//        System.out.println("삭제구분");
//        //특정 인덱스 값 제거
//        aList.remove(0);
//        for (int i = 0; i < aList.size(); i++) {
//            //특정 인덱스값을 꺼내온다.
//            System.out.println(aList.size(i));
//        }

        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Mango");
        stringList.add("Orange");
        stringList.add("Grape");

        System.out.println();
        System.out.println(stringList);

        Collections.sort(stringList); // 배열의 원본에 영향이 있다.
        System.out.println(stringList);

        stringList = new LinkedList(stringList);

        /*
        * Iterator란?
        * Collection 인터페이스의 iterator() 메서드를 이용해 인스턴스를 생성할 수 있음
        * 컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위함
        * 반복자라고 불리며, 반복문을 이용해 목록을 하나씩 꺼내오는 방식으로 사용됨
        * 인덱스로 관리되는 컬렉션이 아닌 경우에는 반복문을 사용해 요소 하나씩 접근할 수 없음
        * 인덱스를 사용하지 않고 반복문을 사용하기 위한 목록을 만들어주는 역할이라고 볼 수 있음
        * hasNext() : 다음 요소를 가지고 있는 경우 true, 더 요소가 없는 경우 false로 변환
        * next : 다음 요소 변환
        *
        * */

        Iterator<String> dIter = ((LinkedList<String>)stringList).descendingIterator();

        while (dIter.hasNext()) {
            System.out.println(dIter.next());
        }
        System.out.println(dIter);

        List<String> descList = new ArrayList<>();
        while(dIter.hasNext()){
            descList.add(dIter.next());
        }

        for (int i = 0; i < descList.size(); i++) {
            System.out.println(descList.get(i));
        }


    }


}
