package com.vector.test;

import com.vector.datastructures.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.prepend(1);
        System.out.printf("list.prepend(1) %n%s%n",list);
        System.out.printf("size: %d%n%n",list.size());
        list.prepend(1);
        System.out.printf("list.prepend(1) %n%s%n",list);
        System.out.printf("size: %d%n%n",list.size());
        list.prepend(2);
        System.out.printf("list.prepend(2) %n%s%n",list);
        System.out.printf("size: %d%n%n",list.size());

        list.append(10);
        System.out.printf("list.append(10) %n%s%n",list);
        System.out.printf("size: %d%n%n",list.size());
        list.append(5);
        System.out.printf("list.append(5) %n%s%n",list);
        System.out.printf("size: %d%n%n",list.size());

        int removedItem = list.removeHead();
        System.out.printf("list.removeHead() %n%s%n",list);
        System.out.printf("removed item : %d%n",removedItem);
        System.out.printf("size: %d%n%n",list.size());

        removedItem = list.delete();
        System.out.printf("list.delete() %n%s%n",list);
        System.out.printf("removed item : %d%n",removedItem);
        System.out.printf("size: %d%n%n",list.size());

        System.out.printf("list.get(0) : %s%n",list.get(0));

    }
}
