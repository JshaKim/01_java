package ohgiraffers.section01.literal;

public class Application02 {
    public static void main(String[] args) {
        // 연산자
        int i = 2;
        System.out.println("2 + 2 = " + (i + i));
        System.out.println("2 - 2 = " + (i - i));
        System.out.println("2 * 2 = " + (i * i));
        System.out.println("2 / 2 = " + (i / i));

        // 123 % 10
        System.out.println("123을 10으로 나눈 수의 나머지는 " + (123 % 10) + "입니다.");

        // 1.23 + 1.23
        // 1.23 - 1.23
        // 1.23 * 1.23
        // 1.23 / 1.23

        float j = 1.23f;
        System.out.println("1.23 + 1.23 = " + (j + j));
        System.out.println("1.23 - 1.23 = " + (j - j));
        System.out.println("1.23 * 1.23 = " + (j * j));
        System.out.println("1.23 / 1.23 = " + (j / j));

        System.out.println("1.23을 1.0으로 나눈 수의 나머지는 " + (1.23f % 1.0f) + "입니다.");

        System.out.println("123" + "12"); // 문자열은 -,*,/,% 해당 없음


    }
}
