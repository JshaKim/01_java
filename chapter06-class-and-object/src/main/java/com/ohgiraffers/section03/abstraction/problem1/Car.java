package com.ohgiraffers.section03.abstraction.problem1;

public class Car {

    private boolean isIn;

    private int speed;

    public boolean isIn() {
        return isIn;
    }

    public void setIn(boolean in) {
        isIn = in;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
