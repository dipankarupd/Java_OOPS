package com.labPrograms;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/*
Develop a Java program to create a linked list of 5 names of programming languages using
appropriate collection class. Remove the first and last element of the linked list and print the
remaining names iterating the list.
 */
public class Lab12 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList(
                new String[] {"Java", "Kotlin", "Flutter", "Swift", "Rust"}
        ));
        // printing the initial list containing five programming languages
        System.out.println("Printing the list: ");
        displayResults(list);

        // removing the first and last elements from the list:
        list.removeFirst();
        list.removeLast();

        // printing hte edited list
        System.out.println("Printing after removing the first and last elements: ");
        displayResults(list);
    }

    // method written to print the given linked list
    static void displayResults(LinkedList<String> list) {
        Iterator<String> it = list.iterator();

        while(it.hasNext()) {
            System.out.print(it.next() + " -> ");
        }
        System.out.print("null");
        System.out.println();

    }
}
