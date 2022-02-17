package com.vector.datastructures;

public class Queue<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void enqueue(T value) {
        list.append(value);
    }

    public T dequeue() {
        return list.removeHead();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
