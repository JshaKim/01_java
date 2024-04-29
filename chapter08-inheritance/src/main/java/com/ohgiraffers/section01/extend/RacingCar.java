package com.ohgiraffers.section01.extend;

public class RacingCar extends Car {

    public RacingCar() {
        System.out.println("RacingCar 클래스 기본 생성자 호출");
    }

    @Override
    public void soundHorn() {
        super.soundHorn();
    }

    @Override
    public boolean isRunning() {
        return super.isRunning();
    }

    @Override
    public void stop() {
        super.stop();
    }
}
