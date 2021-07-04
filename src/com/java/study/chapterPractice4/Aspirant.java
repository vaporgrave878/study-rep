package com.java.study.chapterPractice4;

public class Aspirant extends Student{
    private String work;

    public Aspirant(String firstName, String lastName, int group, double avrMark, String work) {
        super(firstName, lastName, group, avrMark);
        this.work = work;
    }

    @Override
    public int getScholarship(double avrMark) {
        int scholarship;
        if (avrMark == 5d){
            scholarship = 200;
            System.out.println("The scholarship of " + firstName + " " + lastName + " is: " + scholarship + " uah");
            return scholarship;

        }
        else{
            scholarship = 180;
            System.out.println("The scholarship of " + firstName + " " + lastName + " is: " + scholarship + " uah");
            return scholarship;
        }
    }
}
