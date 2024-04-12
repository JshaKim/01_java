package ohgiraffers.section04.overflow;

public class Application01 {
    public static void main(String[] args) {

        /*
        * 자료형 별 값의 최대 범위를 벗허아는 경우 발생한 carry를 버림처리하고 sing bit를 발전시켜 최소값으로 순환시킴
        *
        * */

        byte num1 = 127;
        System.out.println("byte: " + num1);
        num1++;
        System.out.println("byte num : " + num1);

        int firstNum = 2147483647;
        int secondNum = 2;
        System.out.println("first num + second num = " + (firstNum + secondNum)); // 1935130624

        int lnum = firstNum * secondNum;
        System.out.println("first num * second num = " + lnum);

        long result = (long) firstNum * secondNum;
        System.out.println("first num * second num = " + result);
    }
}
