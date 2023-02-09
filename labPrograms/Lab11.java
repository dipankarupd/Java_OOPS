package com.labPrograms;

/*
Write a program to create an ArrayList with the name arrlist and type “String”. Add strings
“AAA”,”BBB”,”CCC”,”DDD”,”EEE” to the arrlist. Add another string “XXX” to first position,
remove the string “AAA”, update “BBB” to “AAA” and display the arrlist.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Lab11 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList(
                new String[]{"AAA", "BBB", "CCC", "DDD", "EEE"}
        ));

        System.out.print("Initial ArrayList: ");
        System.out.println(list);

        list.add(0,"XXX");
        System.out.print("List after adding XXX: ");
        System.out.println(list);

        list.remove("AAA");
        System.out.print("List after removing AAA: ");
        System.out.println(list);


        list.set(list.indexOf("BBB"), "AAA");
        System.out.print("List after adding XXX: ");
        System.out.println(list);
    }
}
