package com.vector.datastructures.nodes;

public class TreeNode<T extends Comparable<T>> {
    private TreeNode<T> leftChildNode;
    private T nodeData;
    private TreeNode<T> rightChildNode;

    public TreeNode(T nodeData){
        this.nodeData = nodeData;
    }
    public void insert(T insertValue) {
        if(insertValue.compareTo(getNodeData())<0){
            if(getLeftChildNode() == null){
                setLeftChildNode(new TreeNode<T>(insertValue));
            }else{
                getLeftChildNode().insert(insertValue);
            }
        }else if(insertValue.compareTo(getNodeData())>0){
            if(getRightChildNode()==null){
                setRightChildNode(new TreeNode<T>(insertValue));
            }else {
                getRightChildNode().insert(insertValue);
            }
        }
    }

    public TreeNode<T> getLeftChildNode() {
        return leftChildNode;
    }

    public void setLeftChildNode(TreeNode<T> leftChildNode) {
        this.leftChildNode = leftChildNode;
    }

    public T getNodeData() {
        return nodeData;
    }

    public void setNodeData(T nodeData) {
        this.nodeData = nodeData;
    }

    public TreeNode<T> getRightChildNode() {
        return rightChildNode;
    }

    public void setRightChildNode(TreeNode<T> rightChildNode) {
        this.rightChildNode = rightChildNode;
    }
}
