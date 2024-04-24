package com.ohgiraffers.section02.problem1;

import com.ohgiraffers.section01.user_type.Member;

public class Application01 {
    public static void main(String[] args) {
        Monster drunkenTiger = new Monster();
        drunkenTiger.name = "드렁큰타이거";
        drunkenTiger.hp = -100;

        System.out.println(drunkenTiger.name);
        System.out.println(drunkenTiger.hp);
        // --- 직접 필드에 접근하면 다음과 같이 -100을 입력해도 오류가 생기지 않는다.

//        Monster monster = new Monster();
//        monster.name = "주황버섯";
//        monster.sethp(-100);
//        System.out.println(monster.hp);
//        monster.hp = -100;
//        System.out.println(monster.hp);
        }
    }

