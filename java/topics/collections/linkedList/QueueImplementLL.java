package com.java.topics.collections.linkedList;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementLL {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();  // Queue is an interface
        queue.add(1);
        queue.add(2);   // add the elements at the last
        queue.add(3);
        queue.add(5);
        queue.remove(); // remove the first element
        // to access the first element
        int x = queue.peek();
        System.out.println(x);

        System.out.println(queue.poll());   // to remove the element from first

        queue.offer(9);     // to add element at the last

        System.out.println(queue);

        System.out.println(queue.element());
    }
}
