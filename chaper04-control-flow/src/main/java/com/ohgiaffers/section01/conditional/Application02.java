package com.ohgiaffers.section01.conditional;

import java.util.Scanner;

// 프로그램 내에서 모두가 사용할 수 있는 Application02이라는 클래스를 선언한다.
public class Application02 { // Application02의 시작
    //프로그램이 시작시 바로 사용할 수 있도록 static 영역에 main이라는 함수를 만들고 문자열 배열의 타입을 가진 arg라는 변수를 선언한다.
    public static void main(String[] args) { // main의 시작
        // D_switch라는 자료형을 가진 dSwitch 변수를 만들고 D_switch 타입으로 값을 제공한다.
        // D_switch는 사용자 정의 자료형으로써 타입은 으루기 만든 D_switch를 확인해야 한다.
        // D_switch dSwitch = new D_switch();
        // dSwitch 변수가 가지고 있는 testSimple메소들르 실행한다.
        // dSwitch.testSimpleSwitchStatement();
        D_switch dSwitch = new D_switch();
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        dSwitch.gradeCal(score);
        //System.out.println(result);
    } // main의 종료
} // Application02의 종료
