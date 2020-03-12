package com.zipcodewilmington.singlylinkedlist;

public class Node<T> {

    private T element;
    private Node<T> next;
    private int index = 0;

    public Node(T newElement, Node<T> nextNode) {
        this.element = newElement;
        this.next = nextNode;
    }

    public Node(T newElement) {
        this.element = newElement;
        this.next = null;
    }

    public Node() {
        this.element = null;
        this.next = null;
    }

    public T getElement() {
        return this.element;
    }

    public void setElement(T newElement) {
        this.element = newElement;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> newNext) {
        this.next = newNext;

    }
}
