package com.java.study.сhapterPractice5.vehicles;

import com.java.study.сhapterPractice5.details.Engine;
import com.java.study.сhapterPractice5.professions.Driver;

public class Lorry extends Car{
    public int carrying;

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    public Lorry(String model, String carClass, int weight, Driver driver, Engine engine, int carrying) {
        super(model, carClass, weight, driver, engine);
        this.carrying = carrying;
    }
}
