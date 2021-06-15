package com.java.study.chapterPractice2;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.fullName = "Oleksii";
        p1.age = 19;
        p1.move(p1.fullName);
        Person p2 = new Person("Vasilii", 19);
        p2.talk(p2.fullName);
    }
}
