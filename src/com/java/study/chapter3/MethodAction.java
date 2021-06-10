package com.java.study.chapter3;

public class MethodAction {
    public int numberParser(int number, int[] numbers){
        String str = String.valueOf(number);
        int lenth = str.length();
        for(int i = 0; i < lenth; i++){
            char code = str.charAt(i);
            int n = Character.digit(code, 10);
            numbers[i] = n;
        }
        return lenth;
    }
}
