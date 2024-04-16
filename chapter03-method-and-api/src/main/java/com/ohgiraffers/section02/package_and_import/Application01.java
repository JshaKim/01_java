package main.java.com.ohgiraffers.section02.package_and_import;

import static main.java.com.ohgiraffers.section01.method.Calculator.maxNumberOf;

public class Application01 {
    public static void main(String[] args) {
        int first = 200;
        int second = 300;
    //    Calculator cal = new Calculator();

        int max = maxNumberOf(first,second);
    //    int min = cal.minNumberOf(second,first);

        System.out.println(max);
    }
}
