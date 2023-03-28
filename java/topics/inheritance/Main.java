package com.java.topics.inheritance;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2,3,4);
        System.out.println(r1.length);

        Box r2 = new Rectangle(2,3,4);

        Box b1 = new Rectangle(2,3,4);
        b1.defining();


    }
}
