package com.ohgiaffers.section02.loopingg;

import java.util.Scanner;

public class A_for {
    public void testSimpleForStatement() {

        /*
        [for문 표현식]

        for(초기식; 조건식; 증감식){
            //조건식이 참인 경우 실행할 구문 == 반복할 구문
            }

         */

//        for (int i = 0; i <= 10; i++ ) {
//            for (int x = 1; x <= 10; x++ ) {
//                System.out.println("천원 단위 : " + x);
//            }
//            System.out.println("만원 단위 : " + i + "만원 모았습니다.");
//        }
//    // 구구단 만들기
    }

//    public void gugudan() {
//
//            for (int j = 2; j <= 9 ; j++) {
//                System.out.println(j + "단 ");
//                for (int k = 1; k <= 9 ; k++) {
//                    if (k % j == 0) {
//                        System.out.println(j + " X " + k + " = " + j * k);
//                    }
//                }
//
//            }
//        }

        public void name()
        {

            Scanner sc = new Scanner(System.in);

            for (int num = 1; num <=10; num++)
                {
                System.out.println("이름 입력 : ");
                String name = sc.nextLine();
                System.out.println("나이 입력 : ");
                int age = sc.nextInt();
                System.out.println(name + age);

                }

            }


        }




