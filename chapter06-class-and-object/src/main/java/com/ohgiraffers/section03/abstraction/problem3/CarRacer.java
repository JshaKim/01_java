package com.ohgiraffers.section03.abstraction.problem3;

public class CarRacer {

    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) { // 드라이버가 차를 준 상황
        this.car = car;
    }

    public void startUp() {
        this.car.startUp();
    }

    public void shutDown() {
        this.car.shutdown();
    }

    public void go() {
        this.car.go();
    }

    public void stop() {
        this.car.stop();
    }

    public void myCarInfo(){
        System.out.println(this.car.carName());
    }

}
