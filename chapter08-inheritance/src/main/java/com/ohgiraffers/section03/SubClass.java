package com.ohgiraffers.section03;

public class SubClass extends SuperClass {
    // 아래의 private 메서드는 자식에서 접근할 수 없는 메서드로 재정의 불가능
    // private void privateMetho


    @Override
    public void method(int num) {
        super.method(num);
    }

    @Override
    protected void protectedMethod(int num) {
        super.protectedMethod(num);
    }

    public void exceptionMethod() {}
}
