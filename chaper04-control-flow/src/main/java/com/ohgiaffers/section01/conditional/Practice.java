package com.ohgiaffers.section01.conditional;
import java.util.Scanner;
public class Practice {

    public static void main(String[] args) {
        Practice practice = new Practice();
        Practice.calculator();
    }
    //    * 1. calculator 메서드 만든다.
    public String calculator() {
        //    * 2. 입력 받을 수 있는 기능을 추가한다  이미 입력
        Scanner sc = new Scanner(System.in);
        //    *2. 첫번 째 숫자 입력한다.
        System.out.println("첫 번째 숫자 입력 : ");
        int first = sc.nextInt();

        //    *3. 연산 기호를 입력 받는다.
        System.out.println("연산기호 입력 : ");
        char operator = sc.next().charAt(0);
        //    *4. 두번 째 숫자를 입력한다
        System.out.println("두 번째 숫자 입력 : ");
        int second = sc.nextInt();

        double result;
        //*5. 연산을 진행한다.
        if (operator == '+') {
            result = first + second;
        } else if (operator == '-') {
            result = first - second;
        } else if (operator == '*') {
            result = first - second;
        } else if (operator == '/') {
            result = first - second;
        } else {
            return "연산식 오류";
        }
        return String.valueOf(result);
    }
    //*6. 반환한다.

}