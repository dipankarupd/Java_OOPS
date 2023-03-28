package com.java.topics.collections.linkedList;

import java.util.*;

public class Program1 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add(2,"M");
        list.addFirst("X");
        list.addLast("a");

        LinkedList<String> list2 = new LinkedList<>(Arrays.asList(new String[] {"m", "a", "n"}));

        list.addAll(2,list2);
        System.out.println(list);

        list.remove(1);
        System.out.println();

        Iterator i = list.descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
