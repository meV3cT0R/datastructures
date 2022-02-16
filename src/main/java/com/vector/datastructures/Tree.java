package com.vector.datastructures;

import com.vector.datastructures.nodes.TreeNode;

public class Tree<T extends Comparable<T>> {
    private TreeNode<T> root;

    public void insert(T insertValue) {
        if(root == null)
            root = new TreeNode<T>(insertValue);
        else
            root.insert(insertValue);
    }

    public void binarySort() {
        binarySortInternal(root);
    }
    public void binarySortInternal(TreeNode<T> node) {
        if(node == null)
            return;

        binarySortInternal(node.getLeftChildNode());
        System.out.printf("%s ",String.valueOf(node.getNodeData()));
        binarySortInternal(node.getRightChildNode());
    }
}
