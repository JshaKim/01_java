package main.java.com.ohgiraffers.section01.method;

public class Application03 {

    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        Application03 app3 = new Application03();
        //String result = app3.myinfo("김기호", 39, 'M', "010-8074-2670");
        //int result = app3.plus(x, y);
        int sub = app3.minus(x, y);
        int mul = app3.multiplication(x, y);
        int div = app3.division(x, y);
        int re = app3.remain(x, y);

       // System.out.println(result);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);

        System.out.println(re);

    }
    // 두 수를 더하는 함수
    // 접근제어자, 반환 타입, 함수명(매개변수){

    public int plus(int x, int y) {
        int result = x + y;
        return result;
    }
    public int minus(int x, int y) {
        int sub = x - y;
        return sub;
    }
    public int multiplication(int x, int y) {
        int mul = x * y;
        return mul;
    }
    public int division(int x, int y) {
        int div = x / y;
        return div;
    }
    public int remain(int x, int y) {
        int re = x % y;
        return re;
    }
    // 1. myinfo 함수 만들기
    // 2. 매개변수 (String name, int age, char gender, String phone)
    // 3. 매개변수 더하기 String result = name + age + gender + phone
    // 4. return result
    public String myinfo(String name, int age, char gender, String phone) {
        return (name + " " + age + " " + gender + " " + phone);
    }

}

