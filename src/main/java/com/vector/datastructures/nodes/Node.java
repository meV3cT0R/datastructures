package com.vector.datastructures.nodes;

public class Node<T> {
    private T nodeData;
    private Node<T> nextNode;

    public Node(T nodeData) {
        this.nodeData = nodeData;
    }
    public T getNodeData() {
        return nodeData;
    }

    public void setNodeData(T nodeData) {
        this.nodeData = nodeData;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
}
