package ohgiraffers.section03.increment;

public class Application01 {
    public static void main(String[] args) {
        /*
        * 증감연산자
        * 피연산자의 앞 or 뒤에 사용이 가능하다.
        * '++' : 1의 증가를 의미
        * '--' : 1의 감소를 의미
        * ++i || i++
        *
        * */

        int num = 0;
        num++;
        int x = 10 + (++num);
        System.out.println(num);
        x = 10 + num++;
        System.out.println(x);
        System.out.println(num);

        num = 0;
        int result = num++ * 10;
        // result = num * 10;
        // result += 1;
        System.out.println(result);

        result = ++num * 10;
        System.out.println(result);

    }
}
