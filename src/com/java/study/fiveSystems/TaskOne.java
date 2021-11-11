package com.java.study.fiveSystems;

import java.util.Arrays;
import java.util.Comparator;

public class TaskOne {


    public boolean areElementsEqualNum(int[] array, int num){
        if (!isArraySorted(array))
            Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int firstEl = array[i];
            for (int j = 0; j < array.length; j++){
                int secondEll = array[j];
                if (firstEl + secondEll == num){
                    System.out.println("First array element: " + firstEl);
                    System.out.println("Second array element: " + secondEll);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isArraySorted(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] > array[i + 1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TaskOne test = new TaskOne();
        int[] array = new int[]{2, 6, 7, 9, 15, 20};
        int[] array2 = new int[]{-3, 7, 4, 2, 5, 10};
        int num = 21;
        boolean result = test.areElementsEqualNum(array, num);
        System.out.println(result);
        System.out.println("------------");
        boolean result2 = test.areElementsEqualNum(array2, num);
        System.out.println(result2);

        /*System.out.println("----------------");

        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("2");
        list.add("3");
        list.add("8");
        list.add(1, "4");

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.size());
        System.out.println(list.isEmpty());*/

    }
    }
