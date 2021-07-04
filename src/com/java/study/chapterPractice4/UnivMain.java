package com.java.study.chapterPractice4;

public class UnivMain {
    public static void main(String[] args) {
        Student st1 = new Student("Петров", "Василий", 1, 2.0);
        Student st2 = new Student("Иванов", "Евгений", 1, 3.0);
        Student st3 = new Student("Харченков", "Иван", 2, 5.0);
        Student st4 = new Student("Синий", "Петр", 4, 5.0);
        Student a1 = new Aspirant("Пупкин", "Андрей", 1, 4.78, "work1");
        Student a2 = new Aspirant("Залупкин", "Семен", 2, 3.39, "work2");

        Student[] students = {st1, st2, st3, st4, a1, a2};
        for (Student student:
             students) {
            student.getScholarship(student.getAvrMark());
        }
    }
}
