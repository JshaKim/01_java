package practice;

import java.util.Scanner;

public class Method1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력하세요. : ");
        int age = sc.nextInt();
        int checkAge;
        checkAge = age;

            if (checkAge < 18) {
                System.out.println("미성년자는 출입 불가합니다.");
                return;
            } else {
                System.out.println("입장하세요");
                return;
        }
    }
}
