package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NegativeException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws PriceNegativeException, MoneyNegativeException, NegativeException {

        if (price < 0) {
            throw new PriceNegativeException("샘플 가격은 음수일 수 없습니다.");
        }
        if (money < 0) {
            throw new PriceNegativeException("가지고 있는 돈은 음수일 수 없습니다.");
        }
        if (money < price) {
            throw new PriceNegativeException("가진 돈보다 상품 가격이 더 비쌉니다.");
        }
        System.out.println("즐쇼");
    }
}
