package com.java.topics.multithreading;

public class CreateThread {
    public static void main(String[] args) {

        Thread t;
        DemoThread obj = new DemoThread();
        t = new Thread(obj, "First thread");
        t.start();
    }
}
class DemoThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Happy Coding!!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
