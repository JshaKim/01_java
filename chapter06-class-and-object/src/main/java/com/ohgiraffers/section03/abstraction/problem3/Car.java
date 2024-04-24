package com.ohgiraffers.section03.abstraction.problem3;

public class Car {

    private boolean isIn;

    private int speed;

    private String name;

    public String carName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void startUp(){ // 시동을 거는 동작
        if(isIn){
            System.out.println("이미 시동이 걸려 있습니다.");
        } else
        {
            this.isIn = true;
            System.out.println("시동이 걸렸습니다. 이제 출발할 준비가 되었습니다.");
        }
    }

    public void shutdown(){
        if(isIn){
            if (this.speed > 0){
                System.out.println("자동차를 멈추고 다시 종료해세주세요.");
            }
            this.isIn = false;
            System.out.println("시동을 끕니다.");
        }
        else
        {
            System.out.println("이미 시동이 꺼져 있습니다.");
        }
    }

    public void go(){
        if(this.isIn){
            this.speed +=10;
            System.out.println("현재 주행 속도는 " + this.speed + "km/h  입니다.");
        }
        else
        {
            System.out.println("시동이 꺼져 있습니다. 먼저 시동을 걸어주세요.");
        }
    }

    public void stop(){
        if(this.isIn){
            if (this.speed > 0) {
                this.speed = 0;
                System.out.println("브레이크를 밝았습니다.");
            }
            else {
                System.out.println("차가 멈춰있는 상태입니다.");
            }
        }
        else
        {
            System.out.println("시동이 꺼져 있습니다. 먼저 시동을 걸어주세요.");
        }
    }
}
