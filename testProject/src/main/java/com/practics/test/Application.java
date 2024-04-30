package com.practics.test;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String result = "";

        // 우편번호 도출 프로그램

        // 이름 입력
        System.out.print("이름을 입력하세요 : " );
        String name = in.nextLine();

        // 연락처 입력
        System.out.print("전화번호를 입력하세요 : " );
        String phone = in.nextLine();

        // 주소 입력
        System.out.print("주소를 입력하세요 : " );
        String address = in.nextLine();

        DTO dto = new DTO(name, phone, address);
        result = dto.toString();

        // 목표 출력값
        System.out.println(name + " 님!(" + phone + ")의 주소지(" + address + ") 우편번호는 " + "zipCode" + "입니다.");


    }
}
