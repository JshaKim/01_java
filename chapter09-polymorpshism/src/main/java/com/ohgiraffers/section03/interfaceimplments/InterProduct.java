package com.ohgiraffers.section03.interfaceimplments;

import java.io.Serializable;

public interface InterProduct extends Serializable {

    /*
    * 인터페이스는 상수 필드만 작성 가능, 인터페이스는 생성자를 가질 수 없다.
    * public static final 제어자 조합을 상수 필드라고 부른다.
    * 반드시 선언과 동시에 초기화해야 한다.
    * */

    public static final int MAX_NUM = 100;
    //int num;

    //인터페이스는 상수 필드만 작성이 가능하기 때문이 일반 변수처럼 선언해도 상수 필드로 된다.
    //묵시적으로 public static final int num이 된다는 뜻.

    //인터페이스는 추상메서드의 묶음으로 추상메서드만 선언 가능함
    //public void nonStaticMethod(){} -->

    public abstract void nonStaticMethod();

    /*
    * 인터페이스 안에 작성한 메서드는 묵시적으로 public abstract의 의미를 가짐
    * 따라서 인터페이스의 메서드는 오버라이딩 하는 경우 반드시 접근제한자를 public으로 해야
    * 오버라이딩 가능
    * */

    void abstractMethod();

    // static 메서드는 작성 / 몸체를 가지는 것이 가능하다(jdk 1.8 추가)
    public static void staticMethod() {
        System.out.println("static method / static 환경에서 불러오기 가능");
    }


    // default 키워드를 사용하면 non-static 메서드로 작성이 가능하다(jdk 1.8추가)
    public default void defaultMethod() {
        System.out.println("default method / default 환경에서 불러오기 가능");

    }


}
