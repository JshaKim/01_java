package com.ohgiaffers.section01.conditional;

import java.util.Scanner;

public class D_switch {
// D_switch라는 클래스를 모두가 사용할 수 있도록 만든다.
//    public void testSimpleSwitchStatement() { //testSimpleSwitchStatement 메서드의 시작
//        //testSimpleSwitchStatement라는 반환값이 없는 메서드를 모두가 사용할 수 있도록 한다.
//        /*
//        * [switch문 표현식]
//        * switch(비교대상값) {
//        *   case 비교값 :  비교값이 참인 경우 시행할 구분; brake;
//        *   case 비교값 :  비교값이 참인 경우 시행할 구분; brake;
//        *   default : case에 모두 해당하지 않는 경우; brake;
//        * }
//        * */
//
//
//        Scanner sc = new Scanner(System.in);
////        사용자로부터 값을 입력 받을 수 있는 객체를 실행
//
//        System.out.println("첫 번째 정수 입력 : ");
////        사용자로부터 첫 번째 숫자를 입력 받기 위한 지시문 출력
//        int first = sc.nextInt();
////        사용자로부터 첫 번째 값을 정수로 입력 받아 first에 대입
//        System.out.println("두 번째 정수 입력 : ");
////        사용자로부터 두 번째 숫자를 입력 받기 위한 지시문 출력
//        int second = sc.nextInt();
////        사용자로부터 두 번째 값을 정수로 입력 받아 second에 대입
//        System.out.println("연산기호 입력 : ");
////        사용자로부터 연산부호를 입력 받기 위한 지시문 출력
//        char ch = sc.next().charAt(0);
////        사용자로부터 연산부호를 입력 받아 ch에 대입
//
//        // 아래의 계산기를 완성합니다.
//
//        switch (ch){
//            case '+' : System.out.println(first + second); break;
//            case '-' : System.out.println(first - second); break;
//            case '*' : System.out.println(first * second); break;
//            case '/' : System.out.println(first / second); break;
//            default : System.out.println("같지 않음"); break;
//        }
//
//    } // testSimpleSwitchStatement 메서드의 종료
    // 계산기를 만들고 결과를 반환합니다.(switch를 이용함) 반환된 결과는 application02에서 출력하라.
    // + - / * 만 제공하고 일치하는 연산이 없는 경우 연산불가라는 결과를 출력하고 변환 값을 0.0으로 출력하라.

//    public double switchCalculator() {  // 허용된 공간에 리턴이 필요하지 않는 switchCalculator 메서드 만들고 시작한다.
//        Scanner sc = new Scanner(System.in); // 스캔을 객체화 하여 변수 sc에 초기화한다.
//
//        System.out.println("첫 번째 숫자 입력 : ");
//        int i = sc.nextInt();
//        System.out.println("두 번째 숫자 입력 : ");
//        int j = sc.nextInt();
//        System.out.println("연산부호 입력 : ");
//        char ch = sc.next().charAt(0);
//        //double n = 0.0;
//        double result = 0.0;
//        switch (ch) {
//            //case '+': System.out.println(i + j);
//            case '+': result = i + j; break;
//            //case '-': System.out.println(i - j);
//            case '-': result = i - j; break;
//            //case '*': System.out.println(i * j);
//            case '*': result = i * j; break;
//            //case '/': System.out.println(i / j);
//            case '/': result = i / j; break;
//            default: //System.out.println("연산 불가" + " / " + n);
//            System.out.println("연산 불가");
//                break;
//        }
//        // return;
//         return result;
//    }


    // 등급 계산기 프로그램(if문으로)
    // main에서 학생의 성적을 입력받고 아래의 메서드에서 학생의 등급을 화면에 출력해주세요
    // 100 = a+
    // 100-90 = a
    // 90-85 = b+
    // 85-75 = b
    // 75-60 = c
    // 60 미만 = d
    // f = 없다.

//    1. 메서드를 만든다.
//    2. 점수 범위를 구분한다.
//    3. 출력한다.


    public void gradeCal(int score) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하세요 : ");
        //int grade = sc.nextInt();
        String grade = "";

        if (score == 100) {
            //System.out.println("a+");
            grade = "A+";
        } else if (score < 100 && score >= 90) {
            //System.out.println("a");
            grade = "A";
        } else if (score <= 90 && score >= 85) {
            //System.out.println("b+");
            grade = "B+";
        } else if (score <= 85 && score >= 75) {
            //System.out.println("b");
            grade = "B";
        } else if (score <= 75 && score >= 60) {
            //System.out.println("c");
            grade = "C";
        } else if (score <= 60 && score >= 0) {
            //System.out.println("d");
            grade = "D";
        } else {
            //System.out.println("f");
            grade = "F";
        }
        System.out.println(grade);
    }


// D-switch 클래스의 종료
    }
