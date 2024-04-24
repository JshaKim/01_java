package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Test {

    /*
    * A학생의 평균 점수를 구하는 프로그램을 만들어 주세요.
    * 시험의 과목은 5개로 점수는 정수 단위입니다.
    * 5개 과목의 점수를 입력 받고 평균을 구하여 화면에 풀력합니다.
    * 예 ) A학생의 수학 : 90점, 영어 : 80점, 국어 : 100점, 과학 : 79점, 사회 : 80점이며 평균은 x 입니다.
    *
    * */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("수학 점수 이력 : ");
        int math = sc.nextInt();
        System.out.println("영어 점수 이력 : ");
        int eng = sc.nextInt();
        System.out.println("국어 점수 이력 : ");
        int lang = sc.nextInt();
        System.out.println("과학 점수 이력 : ");
        int science = sc.nextInt();
        System.out.println("사회 점수 이력 : ");
        int social = sc.nextInt();

        int[] arr = new int[5];
        arr[0] = math;
        arr[1] = eng;
        arr[2] = lang;
        arr[3] = science;
        arr[4] = social;

        int sum = math + eng + lang + science + social;
        int average = sum / 5;
        System.out.println("A학생의 수학 : " + math + ", 영어 : " + eng + ", 국어 : " + lang + ", 과학 : " + science + ", 사회 : " + social + "점이며 평균은 " + average + "점 입니다.");


/*
    public void average() {
        Scanner sc = new Scanner(System.in);
        String[] subject = {"수학", "영어", "국어", "과학", "사회"};
        int [] score = new int [5];
        int result = 0;
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i] + "점수 입력 : ");
            score[i] = sc.nextInt();
            result += score[i];
        }
        double average = result / score.length;

        for (int i = 0; i < score.length; i++) {
            System.out.println((subject[i]) + " : " + score[i] + " ");
        }
        System.out.println(average);
    }
    */
    }
}




