package com.vector.datastructures;

import com.vector.datastructures.exceptions.EmptyListException;
import com.vector.datastructures.exceptions.ListIndexOutOfBoundException;
import com.vector.datastructures.nodes.Node;

public class LinkedList<T> {
    private Node<T> headNode;
    private Node<T> tailNode;

    public boolean isEmpty() {
        return headNode == null;
    }

    public void append(T data) {
        Node<T> newNode = new Node<T>(data);
        if(isEmpty())
            headNode= tailNode = newNode;
        else {
           tailNode.setNextNode(newNode);
           tailNode = newNode;
        }
    }

    public void prepend(T data) {
        Node<T> newNode = new Node<T>(data);
        if(isEmpty())
            headNode = tailNode = newNode;
        else {
            newNode.setNextNode(headNode);
            headNode = newNode;
        }
    }
    public T removeHead(){
        if(isEmpty())
            throw new EmptyListException();
        T removeItem = headNode.getNodeData();
        headNode = headNode.getNextNode();
        return removeItem;
    }

    public T delete() {
        if(isEmpty())
            throw new EmptyListException();
        T removeItem = tailNode.getNodeData();
        Node<T> currentNode = headNode;
        while(currentNode.getNextNode() != tailNode){
            currentNode = currentNode.getNextNode();
        }
        currentNode.setNextNode(null);
        tailNode = currentNode;
        return removeItem;
    }
    public int size() {
        int size=0;
        Node<T> currentNode = headNode;
        while(currentNode != null){
            size++;
            currentNode = currentNode.getNextNode();
        }
        return size;
    }

    public T get(int index) {
        if(isEmpty())
            throw new EmptyListException();

        if(index>size())
            throw new ListIndexOutOfBoundException();

        Node<T> currentNode = headNode;
        int i = 0;
        while (currentNode != null) {
            if (index == i)
                return currentNode.getNodeData();
            i++;
            currentNode = currentNode.getNextNode();
        }
        return null;
    }

    @Override
    public String toString(){
        if(isEmpty())
            return "List is Empty , broo";
        String string = "";
        Node<T> currentNode = headNode;
        while(currentNode !=null){
            string += String.format("[ %s ] %s ",String.valueOf(currentNode.getNodeData()),currentNode == tailNode ? "":"->");
            currentNode = currentNode.getNextNode();

        }
        return string;
    }
}
