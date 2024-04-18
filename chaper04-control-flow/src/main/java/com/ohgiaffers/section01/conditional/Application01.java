package com.ohgiaffers.section01.conditional;
import java.util.Scanner;
public class Application01 {
    public static void main(String[] args) {
        A_if aIf = new A_if();
        aIf.restSimpleIfStatement();
        Practice practice = new Practice();
    }
    public String call() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] target = input.split(" ");
        int result = 0;

        if (target[1].equals('+')) {
            result = Integer.parseInt(target[0]) + Integer.parseInt(target[2]);
        }
        String a = "1";
        String b = "1";
        return "" + result;
    }

}




