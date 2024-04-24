package com.ohgiraffers.section03.abstraction.problem3;

public class Application01 {

    public static void main(String[] args) {

        Car car = new Car();
        car.setName("My car : SM3");
        Car car1 = new Car();
        car.setName("My car : Volvo CX60");

        CarRacer kim = new CarRacer();
        kim.setCar(car);
        kim.myCarInfo();

        kim.startUp();
        kim.go();
        kim.stop();
        kim.shutDown();



    }
}
