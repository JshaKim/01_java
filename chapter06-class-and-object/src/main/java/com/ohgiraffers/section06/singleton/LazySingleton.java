package com.ohgiraffers.section06.singleton;

public class LazySingleton {

    private static LazySingleton lazy;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        System.out.println("lazy 생성됨");

        if (lazy == null) {
            lazy = new LazySingleton();
        }

        return lazy;
    }
}

