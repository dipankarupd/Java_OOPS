package com.java.topics.collections.arrayList;
import java.util.*;

public class BookCollections {

    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {


        ArrayList<Book> list = new ArrayList<>();
        list.add(new Book(1,"First","Me","A",1));
        list.add(new Book(0,"Second","He","AB",5));
        list.add(new Book(3,"Third","She","ABC",7));

        boolean flag = true;
        while(flag) {
            System.out.println("----------------Menu---------------");

            System.out.println("1. Display");
            System.out.println("2. Sort by id");
            System.out.println("3. Find by ID");
            System.out.println("4. Remove a book with a title");

            int choice;
            System.out.println("Enter your choice: ");
            choice = scn.nextInt();

            switch(choice) {
                case 1:
                    display(list);
                    break;

                case 2:
                    sortById(list);
                    break;

                case 3:
                    findById(list);
                    break;

                case 4:
                    removeBook(list);
                    break;


                default:
                    System.out.println("Invalid choice");
                    break;
            }

            System.out.println("If you want to continue press 1");
            int n = scn.nextInt();
            if (n == 1) {
                flag = true;
            } else {
                flag = false;
            }
        }

    }

    static void display(ArrayList<Book> list) {
        for(Book data : list) {
            System.out.println(data);
        }
    }

    static void sortById(ArrayList<Book> list) {
        Collections.sort(list, new SortbyId());
    }
    static void findById(ArrayList<Book> list) {

        int requiredId = 2;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).id == requiredId) {
                System.out.println(list.get(i));
            } else {
                continue;
            }
        }
    }

    static void removeBook (ArrayList<Book> list) {
        boolean found = false;
        scn.nextLine();
        String requiredTitle = scn.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).title.equals(requiredTitle)) {
                list.remove(i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Does not exist");
        }
    }
}

class Book {
    int id;
    String title;
    String author;
    String publisher;
    int quantity;

    public Book(int id, String title, String author, String publisher, int quantity) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public String toString() {
        return(id + " " + title + " " + author + " " + publisher + " " + quantity);
    }
}

class SortbyId implements Comparator<Book> {
    public int compare(Book a, Book b)
    {
        return a.id - b.id;

    }
}
