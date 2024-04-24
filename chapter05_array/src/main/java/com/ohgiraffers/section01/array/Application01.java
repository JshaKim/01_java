package com.ohgiraffers.section01.array;

public class Application01 {
    public static void main(String[] args) {
        /*
        * 배열이란?
        * 동일한 자료형의 묶음(얀속된 메모리 공간에 값을 저장, 사용하기 위한 용도)
        * 배여은 heap 영역에 new 연산자를 이용하여 저장.
        *
        *

        /*
        * 배열의 사용 이유
        * 만약 배열을 사용하지 않는다면 변수를 여러 개 사용해야 한다.
        * 1. 연속된 메모리 공간을 관리할 수 없다.
        * 2. 반복문을 이용한 연속 처리가 불가능하다.
        *
        *

        String bread = "식빵";
        String bread1 = "식빵";
        String bread3 = "식빵";
        String bread4 = "식빵";
        String bread5 = "식빵";
        String bread6 = "식빵";

        // 반복문을 사용
        // 배열의 표현식
        // 자료형[] 변수명 = new 자료형[길이];
        String[] breads = new String[10]; // Index(저장된 순서)
        breads[0] = "식빵";
        breads[1] = "식빵";
        breads[2] = "식빵";
        breads[3] = "식빵";
        breads[4] = "식빵";
        breads[5] = "식빵";
        breads[6] = "식빵";
        breads[7] = "식빵";
        breads[8] = "식빵";
        breads[9] = "식빵";

//        for (int i = 0; i <= 10; i++) {
//            System.out.println(breads[i]);
//        }
        int[] iarr = new int[5]; // 0~4
        char carr[] = new char[10]; //0~9
        iarr[2] = 10;

        System.out.println(iarr[2]);

        iarr = null;
        System.out.println(iarr);


        int result = 100;

        int newArray[] = new int[result];
        for (int i = 0; i < newArray.length; i++) { // length는 0을 취급 안한다.
            newArray[i] = 10;
        }



    }


*/

//        Test ts = new Test();
//        ts.average();
    }
}
