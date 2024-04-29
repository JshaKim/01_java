package com.ohgiraffers.section01.extend;

public class Car {

    private boolean runningstatus;



    public Car() {
        System.out.println("Car 클래스의 기본 생성자 호출됨");
    }

    public void soundHorn(){
        if(isRunning()){
            System.out.println("빵! 빵!");
        } else {
            System.out.println("주행중이 아닌 상태에서 경적을 우울릴 수 없습니다.");
        }
    }
    public boolean isRunning(){
      //  protected boolean isRunning(){
            return runningstatus;
        }
        public void stop(){
            runningstatus = false;
            System.out.println("자동차가 멈춥니다.");
        }

        public void run(){
            runningstatus = false;
            System.out.println("자동차가 멈춥니다.");
        }
    }


