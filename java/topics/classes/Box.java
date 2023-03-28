package com.java.topics.classes;

public class Box {


    double width;
    double height;
    double depth;

    public double findArea() {
        return width * height * depth;
    }

    // constructor 1
    Box(double width,double height,double depth) {
        this.width = width;     // box.width = width
        this.depth = depth;
        this.height = height;
    }

    // constructor 2
    Box(){
        width = 5;
        height = 5;
        depth = 5;
    }
}
