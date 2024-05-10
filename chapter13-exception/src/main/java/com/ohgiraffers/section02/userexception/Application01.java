package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application01 {

    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();


//        try {
//            et.checkEnoughMoney(100, 200);
//            try {
//                et.checkEnoughMoney(100, -200);
//            } catch (MoneyNegativeException e) {
//                System.out.println("정신 챙기자");
//            } catch (Exception e) {
//                System.out.println("상품 가격 제대로 써라");
//            }
//
//            System.out.println("상품 종료");
//        }

//            et.checkEnoughMoney(100, 200);
//        } catch (PriceNegativeException e) {
//            System.out.println("음수냐?");
//        } catch (MoneyNegativeException e) {
//            System.out.println("돈이 음수가 어떻게 나와?");
//        } catch (NotEnoughException e) {
//            System.out.println("너 돈 없지?");
//        } catch (Exception e) {
//            System.out.println("뭐든 에러");
//        }

        try {
            et.checkEnoughMoney(100, 200);
            et.checkEnoughMoney(200, -200);

            et.checkEnoughMoney(20, 200);
        } catch (Exception e) {
            // Exception은 모든 예외의 최상위 타입으로 아래의 예외를 검사하지 않음ㅁ
        } catch (PriceNegativeException e) {
            System.out.println("음수냐?");
        } catch (MoneyNegativeException e) {
            System.out.println("돈이 음수가 어떻게 나와?");
        } catch (NotEnoughException e) {
            System.out.println("너 돈 없지?");
        }
        System.out.println("쇼핑 종료");
    }
}




