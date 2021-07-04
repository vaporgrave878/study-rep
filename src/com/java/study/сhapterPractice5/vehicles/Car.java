package com.java.study.сhapterPractice5.vehicles;

import com.java.study.сhapterPractice5.details.Engine;
import com.java.study.сhapterPractice5.professions.Driver;

public class Car {
    public String model;
    public String carClass;
    public int weight;
    public Driver driver;
    public Engine engine;

    public Car(String model, String carClass, int weight, Driver driver, Engine engine) {
        this.model = model;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public String getCarClass() {
        return carClass;
    }

    public int getWeight() {
        return weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }

    public void start(){
        System.out.println("Here we go!");
    }
    public void stop(){
        System.out.println("Stoop!");
    }
    public void turnLeft(){
        System.out.println("Turning left");
    }
    public void turnRight(){
        System.out.println("Turning right");
    }
}
