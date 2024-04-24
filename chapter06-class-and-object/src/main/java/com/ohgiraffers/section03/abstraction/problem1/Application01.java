package com.ohgiraffers.section03.abstraction.problem1;

public class Application01 {

    public static void main(String[] args) {

        Car car = new Car();
        CarRacer carRacer = new CarRacer();
        carRacer.setName("김기호");

    //    car.isIn(true);
        if (car.isIn()) {
            System.out.println("시동이 걸렸습니다.");
            System.out.println("자동차가 출발합니다.");
    //        carRacer.setIn(true);
            if (car.isIn()){
            //    car.setIn(10);
            }
            System.out.println("자동차의 현재 속도 " + car.getSpeed() + " km/h");

            if(car.getSpeed() == 10){
                System.out.println("자동차의 시동을 끕니다.");
                car.setIn(false);
            } else {
                System.out.println("자동차를 정지하지 않은 상태에서는 자동차를 멈출 수 없습니다.");
            }

            System.out.println("자동차를 멈추겠습니다.");
            car.setSpeed(0);
            System.out.println("이제 자동차를 정지할 수 있습니다.");
            car.setIn(false);

        }
    }
}
