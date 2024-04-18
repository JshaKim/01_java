package main.java.com.ohgiraffers.section04.scanner;

import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // sc 변수명 == 메모리주소 == 값
/*
        String name = "";
        float high = 0.1f;
        String gender = "";
        int age = 0;

        System.out.println("사용자 이름 : ");
        name = sc.nextLine();
        System.out.println("사용자 키 : ");
        high = Float.parseFloat(sc.nextLine());
        System.out.println("사용자 성별 : ");
        gender = sc.nextLine();
        System.out.println("사용자 나이 : ");
        age = sc.nextInt();

/*
        System.out.println("사용자 이름 : " + name);
        System.out.println("사용자 키 : " + high);
        System.out.println("사용자 성별 : " + gender);
        System.out.println("사용자 나이 : " + age);
*/

        Application01 app1 = new Application01();
        String info = app1.inputInfo();
        System.out.println(info);

    }

    public String inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("당신의 키 : ");
        double height = sc.nextDouble();
        System.out.println("당신의 나이: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("당신의 성별 : ");
        char gender = sc.nextLine().charAt(0);
        System.out.println("당신의 이름 : ");
        String name = sc.nextLine();


        return "당신의 키는 " + height + "입니다.\n" +  "당신의 나이는 " + age + "입니다. \n" + "당신의 성별은 " + gender + "입니다. \n" + "당신의 이름은 "+ name + "입니다.";
    }


    /*
    * inputInfo 매서드 만들고
    * 사용자의 이름, 키, 성별, 나이를 입력 받아 main에서 출력해주세요.
    *
    * 1. inputInfo 함수를 만든다.
    *    접근제어자, 반환타입(String), 매서드명
    * 2. 사용자에게 값을 입력 받는다.
    *    Scanner sc = new Scanner();
    * 3. 입력 받은 정보를 문자열로 합친다.
    *    double high = ;
    *    int age = ;
    *    char gender = ;
    *    String name = ;
    * 4. 문자열로 반환한다.
    *    return;
    * */



    }

