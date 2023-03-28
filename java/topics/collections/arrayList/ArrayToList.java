package com.java.topics.collections.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

    public static void main(String[] args) {

        String[] arr = {"Java", "Python", "Kotlin"};

        List<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
    }
}
