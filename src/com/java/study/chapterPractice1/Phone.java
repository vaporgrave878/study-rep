package com.java.study.chapterPractice1;

import java.util.Arrays;

public class Phone {
    public int number;
    public String model;
    public int weight;

    public Phone(int number, String model, int weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone(){
    }

    public void receiveCall(String name){
        System.out.println(name + " is calling you");
    }

    public void receiveCall(String name, int number){
        System.out.println(name + name + " is calling you");
    }

    public void sendMessage(int ... number){
        System.out.println(Arrays.toString(number));
    }

    public int getNumber() {
        return number;
    }
}
