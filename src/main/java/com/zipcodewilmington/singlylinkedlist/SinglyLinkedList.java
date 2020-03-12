package com.zipcodewilmington.singlylinkedlist;

import java.util.logging.Logger;

/**
 * Created by leon on 1/10/18.
 * By: Giles Bradford | collaborated with Jimmy Churu
 * Date: 09-March-2020
 *
 */
public class SinglyLinkedList<T> {

    private static final Logger LOGGER = Logger.getLogger(SinglyLinkedList.class.getName());

    private Node<T> head;
    private Node<T> tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add (T newElement) {
        if (head == null) {
            head = new Node<>(newElement);
            tail = head;
        } else {
            Node<T> nodster = new Node<>(newElement);
            tail.setNext(nodster);
            tail = nodster;
        }
    }

    public void remove(Integer index) {

        Node<T> currentHead = head;
        Node<T> originalHead = head;

        for (int i = 0; i < index; i++) {
            //currentHead = currentHead.getNext();
            if (i == index - 1) {
                currentHead = currentHead.getNext();
            }
        }

        originalHead.setNext(currentHead);
    }

    public int getSize(Node<T> currentHead) {
        int count = 0;
        Node<T> link = currentHead;
        while (link != null) {
            link = link.getNext();
            count++;
        }
        return count;
    }

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }
    
    public boolean isEmpty() {
        return(head == null);
    }

}
