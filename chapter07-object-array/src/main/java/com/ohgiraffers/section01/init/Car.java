package com.ohgiraffers.section01.init;

public class Car {

    private String modelNaem;
    public int maxSpeed;

    public Car(String modelNaem, int maxSpeed) {

        this.modelNaem = modelNaem;
        this.maxSpeed = maxSpeed;
    }

    public void driveMaxSpeed(){
        System.out.println(modelNaem + "이 최고시속 " + maxSpeed + "km/h로 달려갑니다.");
    }
}
