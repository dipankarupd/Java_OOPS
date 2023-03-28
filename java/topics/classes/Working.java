package com.java.topics.classes;

public class Working {
    public static void main(String[] args) {
          Box newBox = new Box();
        newBox.depth = 4;
        newBox.width = 5;
        newBox.height = 3;
        System.out.println(newBox.findArea());

        Box box = new Box(1,2,3);
        System.out.println(box.findArea());
    }
}
