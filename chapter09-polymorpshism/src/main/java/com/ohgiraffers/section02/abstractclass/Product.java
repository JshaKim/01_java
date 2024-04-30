package com.ohgiraffers.section02.abstractclass;

public abstract class Product {

    private int numStatidField;
    private static int sstaticFiled;

    public Product(){

    }

    public void nonStatidMethod(){
        System.out.println("Product클래스의 nonStatidMethod 호출함");
    }

    public static void staticMethod(){
        System.out.println("Product클래스의 staticMethod 호출함");
    }

    public abstract void absMethod();
}
