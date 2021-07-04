package com.java.study.сhapterPractice5.details;

public class Engine {
    public int power;
    public String company;

    public Engine(int power, String company) {
        this.power = power;
        this.company = company;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPower() {
        return power;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", company='" + company + '\'' +
                '}';
    }
}
