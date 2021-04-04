package com.java.study.chapter2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char [] array  = {'a', 'b', 'c'};
        for (char element : array){
            element += element;
        }
        System.out.println(Arrays.toString(array));
        String s1 = "Java";
        String s2 = "12";
        String s3 = "";
        String a = s1 + s2;
        System.out.println(s1 + " " + a);

    }
}
