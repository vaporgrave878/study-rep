package com.java.study.сhapterPractice5.vehicles;

import com.java.study.сhapterPractice5.details.Engine;
import com.java.study.сhapterPractice5.professions.Driver;

public class SportCar extends Car{
    public double speed;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public SportCar(String model, String carClass, int weight, Driver driver, Engine engine, double speed) {
        super(model, carClass, weight, driver, engine);
        this.speed = speed;
    }
}
