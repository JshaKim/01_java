package com.ohgiraffers.section02.userexception.exception;

public class MoneyNegativeException extends NumberFormatException {

    public MoneyNegativeException(String message) {
        super(message);
    }

}
