package com.vector.datastructures.exceptions;

public class EmptyListException extends RuntimeException{
    public EmptyListException() {
        this("List is Empty");
    }
    public EmptyListException(String message) {
        super(message);
    }
}
