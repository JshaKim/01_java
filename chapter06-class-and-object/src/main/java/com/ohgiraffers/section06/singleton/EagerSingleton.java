package com.ohgiraffers.section06.singleton;

public class EagerSingleton {

    private static EagerSingleton Singleton = new EagerSingleton();

    private EagerSingleton(){
        System.out.println("생성됨");

    }

    public static EagerSingleton getInstance(){
        return Singleton;
    }

}
