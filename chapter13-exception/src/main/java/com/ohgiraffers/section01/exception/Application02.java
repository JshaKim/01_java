package com.ohgiraffers.section01.exception;

import org.w3c.dom.ls.LSOutput;

public class Application02 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(1000, 1000000);
            et.checkEnoughMoney(1000, 10);

            System.out.println("이거는 실행이 안된다.");
        } catch(Exception e){
            System.out.println("상품 구입이 불가능합니다.");
        }
        System.out.println("프로그램 종료.");
    }
}
