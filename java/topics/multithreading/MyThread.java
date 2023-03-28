package com.java.topics.multithreading;

/*  The venue of an event has a seating capacity of 50. Tickets need to be cut and the seat
    number need to be shown for 50 seats. * Write a multi-threaded Java program to spawn 2 
    threads from main to share the same run method. One thread must show the message :"Cut
    the ticket", ticketno. Other must show the message:"Show your seat number",seatno.
 */

public class MyThread implements Runnable{

    String name;
    Thread thread;

    MyThread (String name) {
        this.name = name;
        thread = new Thread(this,name);
        thread.start();
    }

    @Override
    public void run() {

        for (int i = 1; i <= 50 ; i++) {
            System.out.println(thread.getName() + ": " + i);

            try {
                Thread.sleep(1000);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Main {
    public static void main(String[] args) {

        MyThread thread1 = new MyThread("Cut the ticket");
        MyThread thread2 = new MyThread("Seat number");
    }
}
