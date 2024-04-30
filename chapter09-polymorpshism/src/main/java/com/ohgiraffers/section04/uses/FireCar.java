package com.ohgiraffers.section04.uses;

public class FireCar extends Car implements Soundable {

    @Override
    public void go(){
        System.out.println("달린다");

    }    @Override
    public void stop(){
        System.out.println("멈춘다");

    }    @Override
    public void horn(){
        System.out.println("경적");
    }
}
