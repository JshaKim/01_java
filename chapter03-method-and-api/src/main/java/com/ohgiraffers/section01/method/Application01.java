package main.java.com.ohgiraffers.section01.method;

public class Application01 {
    public static void main(String[] args) {
        /*
        * 메소드
        * 메소드는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
        * '.'참조연산자
        * class -> 자료형
        * */

        System.out.println("main() 시작됨....");

        Application01 app1 = new Application01();
        app1.methodA();
        //app1.methodB();
        //app1.main();

        System.out.println("main() 종료됨....");


    }

    public void methodA(){ // pubic = 접근 제어자, void =반환타입 없는 경우, methode
        System.out.println("methodA()를 시작됨");
        methodB();
        System.out.println("methodA()를 종료됨");

    }
    public void methodB() { // pubic = 접근 제어자, void =반환타입 없는 경우, methode
        System.out.println("methodB()를 시작됨");
        methodC();
        System.out.println("methodB()를 종료됨");;
    }

    public void methodC() { // pubic = 접근 제어자, void =반환타입 없는 경우, methode
        System.out.println("methodC()를 시작됨");
        System.out.println("methodC()를 종료됨");
    }

}
