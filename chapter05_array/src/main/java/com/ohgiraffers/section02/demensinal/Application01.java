package com.ohgiraffers.section02.demensinal;

public class Application01 {

    public static void main(String[] args) {

        /*
         * 다차원 배열
         * 타차원 배열은 2차원 이상의 배열을 의미한다.
         *
         * 배열의 인덱스마다 또 다른 배열의 주소를 보괗ㄴ하는 배열을 의미한다.
         * 즉, 2차원 배열은 1차원 배열 여러 개를 하나로 묶어서 관리한느 배열을 의미한다.
         * 더 많은 차원의 배열은 사용할 수 있지만, 일반적으로 2차원 배열보다 더 높은 차원의 ㅐ열은 사용빈도가 적다.
         * */

        /*
         * 2차원 배열을 사용하는 방법
         * 1. 배열의 주소를 보관한할 래퍼런스 변수를 선언ㅇ(stack)
         * 2. 여러 개의 1차원 배열의 주소를 관리한는 배열을 생성(heap)
         * 3. 각 인데스에서 관리한느 배열을 할당하여 ㅈ소를 보관하는 배열에 저장
         * 4. 생성한 여러 개의 1차원 배열을 차례로 접근해서 사용
         * 표현식
         * 자료형[][] 변수명 = new 자료형[길이][길이]
         * */

//        int[][] iarr1;
//        int iarr2[][];
//        int[] iarr3[];
//
//        iarr1 = new int[3][3];
//        System.out.println(iarr1[0][0]);
//
//        iarr2 = new int[3][5];
//        System.out.println(iarr2[0][0]);
//
//        iarr1 = new int[3][];
//        iarr1[0] = new int[5];
//        iarr1[1] = new int[4];
//        iarr1[2] = new int[2];
//
//        iarr1[3] = new int[6];
//
//        System.out.println(iarr1[3][0]);

        // 바둑판 만들기
        // 1. 가로 10줄
        int[][] arr = new int[19][19]; //10행

        for (int i = 0; i < 19; i++)
        {
            for (int j = 0; j < 19; j++)
                {
                System.out.print(arr[i][j]);
                }
            System.out.println();
        }
    }
}






        // 1. 가로 10줄
        // 2. 세로 19줄
        // 3. 별 모양으로 출력

