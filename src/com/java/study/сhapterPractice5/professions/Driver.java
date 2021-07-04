package com.java.study.сhapterPractice5.professions;

public class Driver extends Person{
    public int experience;

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Driver(int age, String fullName, int experience) {
        super(age, fullName);
        this.experience = experience;
    }
}
