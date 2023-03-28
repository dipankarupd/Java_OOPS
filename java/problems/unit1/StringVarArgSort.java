package com.java.problems.unit1;

import java.util.Arrays;

/*
                                     Problem 24
Write a Java program to sort strings that are passed as varargs to a method.
 */

public class StringVarArgSort {

    public static void main(String[] args) {
        fun("Hello", "World");

        fun("Bikash", "Dipankar", "Ayush", "Aayush");

        newFn(1,2,3,4,5);
        newFn(true,false);
      //  newFn();

    }

    static void fun(String ... arr)  {
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));


    }

    static void newFn(int ... x) {
        for(int val:x) {
            System.out.println(val);
        }
    }
    static void newFn(boolean ... x) {
        for(boolean val:x) {
            System.out.println(val);
        }
    }
}
