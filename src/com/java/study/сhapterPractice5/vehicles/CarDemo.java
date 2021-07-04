package com.java.study.сhapterPractice5.vehicles;

import com.java.study.сhapterPractice5.details.Engine;
import com.java.study.сhapterPractice5.professions.Driver;

public class CarDemo {
    public static void main(String[] args) {
        Driver toyotaDriver = new Driver(24,"Great teacher Onidzuka", 6);
        Engine toyotaEngine = new Engine(160, "Toyota");
        Car car = new Car("Toyota ae86", "S", 3500, toyotaDriver, toyotaEngine);

        Driver lorryDriver = new Driver(50, "Ivanov V.V.", 30);
        Engine lorryEngine = new Engine(30, "Mercedes");
        Lorry lorry = new Lorry("Mercedes","S", 6000, lorryDriver, lorryEngine, 70);

        Driver sportDriver = new Driver(30, "Petrov A.A.", 12);
        Engine sportEngine = new Engine(80, "Porsche");
        SportCar sportCar = new SportCar("Porsche 911 turbo", "E", 3600, sportDriver, sportEngine, 278);

        System.out.println(car);
        System.out.println(lorry);
        System.out.println(sportCar);
    }
}
