package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

import java.util.Scanner;

public class Application02 {

    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("가격 입력 : ");
            int price = sc.nextInt();
            System.out.println("가진 돈 입력 : ");
            int money = sc.nextInt();

            et.checkEnoughMoney(2000, 1000);
        } catch (PriceNegativeException e) {
            System.out.println("PriceNegativeException 발생");
        } catch (MoneyNegativeException e) {
            System.out.println("MoneyNegativeException 발생");
        } catch (NotEnoughException e) {
            System.out.println("NotEnoughException 발생");
        } catch (NegativeException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("오류 나든 말든");
        }
        } e) {
            System.out.println("PriceNegativeException 발생");
    }
}
