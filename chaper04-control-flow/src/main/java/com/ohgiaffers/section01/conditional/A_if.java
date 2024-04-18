package com.ohgiaffers.section01.conditional;

import java.util.Scanner;

public class A_if {
    public void restSimpleIfStatement() {
        /*
         * [if 표현식]
         *
         * if(조건식){
         *   조건식이 참인 경우에 실행할 명령문
         * }
         *
         * 조건식 : true or false가 나오는 연산식을 의미한다.
         *
         * */
        Scanner sc = new Scanner(System.in);

//        System.out.println("첫번 째 값을 입력해주세요. : ");
        int num = sc.nextInt();
//        double i = sc.nextDouble();

//        System.out.println("연산자를 입력해주세요. : ");
//        char ca = sc.nextLine().charAt(0);

//        System.out.println("두번 째 값을 입력해주세요. : ");
//        double j = sc.nextDouble();

//      2의 배수면 n은 2의 배수입니다
        // 0이면 n은 0입니다
        // 2의 배수가 아니면 n은 2의 배수가 아닙니다.

        if (num == 0) {
            System.out.println(num + "은 0입니다.");
        } else if (num % 2 == 0) {
            System.out.println(num + "은 2의 배수입니다.");
        } else {
            System.out.println(num + "은 2의 배수가 아닙니다.");
        }

/*
        if (ca == '+') {
            System.out.println(i + " + " + j + " = " + (i + j));
        } else if (ca == '-') {
            System.out.println(i + " - " + j + " = " + (i - j));
        } else if (ca == '*') {
            System.out.println(i + " * " + j + " = " + (i * j));
        } else if (ca == '/') {
            System.out.println(i + " / " + j + " = " + (i / j));
        } else {
            System.out.println("잘못된 값입니다.");
        }
*/

        /*
         * 계산기 만들기
         *
         * 두 수와 수식을 입력 받아(i, j)
         * 수식에 맞는 연산을 수정하는 프로그램을 만들어 주세요.
         * */


    }
}