package com.ohgiraffers.section02.problem1;

public class Monster{

    String name;

    int hp;



    //

    public void setHp(int hp){
        if(hp > 0){
            this.hp = hp;
        } else {
            System.out.println("몬스터의 체력은 0보다 작을 수 없습니다.");
        }
//        public int setHp(){
//            return this hp;
    }


    }

