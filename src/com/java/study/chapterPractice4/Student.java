package com.java.study.chapterPractice4;

public class Student{
    protected String firstName;
    protected String lastName;
    protected int group;
    protected double avrMark;

    public Student(String firstName, String lastName, int group, double avrMark) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.avrMark = avrMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGroup() {
        return group;
    }

    public double getAvrMark() {
        return avrMark;
    }
    public int getScholarship(double avrMark){
        int scholarship;
        if (avrMark == 5d){
            scholarship = 100;
            System.out.println("The scholarship of " + firstName + " " + lastName + " is: " + scholarship + " uah");
            return scholarship;

        }
        else{
            scholarship = 80;
            System.out.println("The scholarship of " + firstName + " " + lastName + " is: " + scholarship + " uah");
            return scholarship;
        }
    }
}
