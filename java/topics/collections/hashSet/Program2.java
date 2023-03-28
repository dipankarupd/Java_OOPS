package com.java.topics.collections.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Program2 {
    public static void main(String[] args) {

        HashSet<Book> set = new HashSet<>();
        set.add(new Book(1,"A","Me","author1",1));
        set.add(new Book(2,"C","he","author2",11));
        set.add(new Book(3,"D","Meh","author3",124));
        set.add(new Book(4,"B","She","author4",13));

        Iterator<Book> it = set.iterator();

        while(it.hasNext()) {
            it.next().display();
        }

        it = set.iterator();
        while (it.hasNext()) {
            if (it.next().id == 2) {
                System.out.println("Found the item. Displaying: ");
                it.next().display();
            }
        }

        it = set.iterator();
        boolean found = false;
        while (it.hasNext()) {
            String requiredTitle = "Ax";
            if (it.next().title.equals(requiredTitle)) {
                set.remove(it.next());
                found = true;
                System.out.println("Removed");
                break;
            }
        }
        if (!found) {
            System.out.println("Not found the element with the given title");
        }


    }
}

class Book {
    int id;
    String title;
    String publisher;
    String author;
    int quantity;

    Book(int id, String title, String publisher, String author, int quantity) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public void display() {

        System.out.print("ID: " + id +" ");
        System.out.print("Author: " + author+ " ");
        System.out.print("Title: " + title + " ");
        System.out.print("Publisher: " + publisher + " ");
        System.out.print("Quantity: " + quantity + " ");
        System.out.println();
    }
}
