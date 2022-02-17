package com.vector.test;

import com.vector.datastructures.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();

        System.out.println("isEmpty() : "+q.isEmpty());
        q.enqueue(1);
        System.out.printf("q.enqueue(1)");
        System.out.printf("%n%s%n",q);

        q.enqueue(4);
        System.out.printf("q.enqueue(4)");
        System.out.printf("%n%s%n",q);
    }
}
