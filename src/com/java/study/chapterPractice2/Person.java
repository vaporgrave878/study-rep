package com.java.study.chapterPractice2;

public class Person {
    protected String fullName;
    protected int age;

    public Person(){
    }

    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }
    public void move(String fullName){
        System.out.println(fullName + " moves");
    }

    public void talk(String fullName){
        System.out.println(fullName + " talks");
    }
}
