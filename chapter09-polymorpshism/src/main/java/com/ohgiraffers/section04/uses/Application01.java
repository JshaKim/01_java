package com.ohgiraffers.section04.uses;

public class Application01 {

    public static void main(String[] args) {

        System.out.println("프로그램 시작");

        //Car car = new Car();

        FireCar fireCar = new FireCar();
        fireCar.go();
        fireCar.stop();
        fireCar.horn();

        RacingCar racingCar = new RacingCar();
        racingCar.go();
        racingCar.stop();

        Car[] cars = new Car[2];
        cars[0] = fireCar;
        cars[1] = racingCar;

        for (Car car : cars) {
            car.go();
            car.stop();
//            car.horn();
        }




    }
}
