package com.vector.test;

import com.vector.datastructures.Tree;

import java.util.Random;

public class TreeTest {
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<Integer>();

        Random random = new Random();

        System.out.println("Inserting these values");
        for(int i = 1;i<=1000;i++) {
            int insertValue = random.nextInt(10000000)+1;
            System.out.printf("%d ",insertValue);
            tree.insert(insertValue);
        }
        System.out.println();
        System.out.printf("Binary sort%n");
        tree.binarySort();
    }
}
