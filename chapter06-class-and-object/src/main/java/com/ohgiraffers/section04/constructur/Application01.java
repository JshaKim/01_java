package com.ohgiraffers.section04.constructur;

import java.sql.SQLOutput;

public class Application01 {

    public static void main(String[] args) {

        /*
        *생성자란?
        * 인스턴스를 생성할 때 초기 수행할 명령이 있는 경우 미리 작성해두고,
        * 인스턴스를 생성할 때 호출한다.
        * 생성자 함수에 매개변수가 없는 생성자를 기본 생성자(defaoult constructur)
        * 기본 생성자는 complier에 의해 자동으로 추가되기 때문에 명시적으로 작성하지 않고
        * 사용할 수 있었다.
        * (인스턴스 생성 시 별도로 수행할 명령이 없었기 때문에 아무것도 작성하지 않을 것이다.)
        *
        * */
        User song = new User("쏭",29,"010-0000-0011");

        System.out.println(song);
    }
}
