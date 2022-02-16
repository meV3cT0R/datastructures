package com.vector.test;

import com.vector.datastructures.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        System.out.printf("stack.push(1) %n%s%n%n",stack);
        stack.push(2);
        System.out.printf("stack.push(2) %n%s%n%n",stack);

        stack.push(15);
        System.out.printf("stack.push(15) %n%s%n%n",stack);

        stack.pop();
        System.out.printf("stack.pop() %n%s%n%n",stack);
    }
}
