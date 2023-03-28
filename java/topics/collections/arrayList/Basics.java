package com.java.topics.collections.arrayList;
import java.util.*;
public class Basics {
    public static void main(String[] args) {

        List <String> list = new ArrayList<>();

        list.add("Java");
        list.add("R");
        list.add("Python");
        list.add("Kotlin");
        list.add("Swift");

        System.out.println("Traversing through the for loop");
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        System.out.println("Traversing through the iterator");
        System.out.println();
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        System.out.println("Traversing through the iterator in reverse");
        System.out.println();
        ListIterator<String> it2 = list.listIterator(list.size());
        while(it2.hasPrevious()) {
            String str = it2.previous();
            System.out.print(str +" " );
        }
        System.out.println();

        System.out.println("Traversing through the for each loop");
        System.out.println();
        for (String languages: list) {
            System.out.print(languages + " ");
        }
        System.out.println();

        Collections.sort(list);
        System.out.println(list);
    }
}
