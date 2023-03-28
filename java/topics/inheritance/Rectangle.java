package com.java.topics.inheritance;

public class Rectangle extends Box{

    int width;
    Rectangle(int length, int area, int width) {
        super(length, area);
        this.width = width;
    }

    void defining() {
        super.defining();
        System.out.println("This is a rectangle class");
    }
}
