package com.ohgiraffers.section01.polymorpshim;

public class Tiger extends Animal {

    @Override
    public void eat() {
        System.out.println("호랑이가 고기를 뜯습니다.");
    }

    @Override
    public void run() {
        System.out.println("호랑이가 달리지 않습니다.");
    }

    @Override
    public void cry() {
        System.out.println("호랑이가 울부짖습니다.");
    }

    public void bite() {
        System.out.println("호랑이가 물어 뜯습니다.");
    }
}
