package com.java.topics.collections.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Program1 {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("One"); // set contains only unique elements... no duplicates will be added

        System.out.println(set);

        set.remove("Three");
        System.out.println(set);

        HashSet<String> set2 = new HashSet<>();
        set2.add("Hello");
        set2.add("World");
        set2.add("Happy");
        set2.add("Coding");

        set2.addAll(set);
        System.out.println(set2);

        // remove if the set contains "Two"
        set.removeIf(str -> str.contains("Two"));
        System.out.println(set);

        set.clear();
        System.out.println(set);
    }
}
