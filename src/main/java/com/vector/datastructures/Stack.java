package com.vector.datastructures;

public class Stack<T> {
    protected LinkedList<T> list;
    public Stack() {
        list = new LinkedList<T>();
    }

    public void push(T data) {
       getList().prepend(data);
    }

    public T pop() {
        return getList().removeHead();
    }

    public boolean isEmpty() {
        return getList().isEmpty();
    }

    @Override
    public String toString() {
        return getList().toString();
    }
    protected LinkedList<T> getList() {
        return list;
    }

    protected void setList(LinkedList<T> list) {
        this.list = list;
    }
}
