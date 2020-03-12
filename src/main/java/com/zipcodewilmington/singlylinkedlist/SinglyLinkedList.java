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

    public void remove(Integer toRemove) {

        Node<T> currentNode = head;
        Node<T> nextNode = null;
        Node<T> buffer = null;
        int lastIndex = (getSize(head)-1);

        if (toRemove == 0) {
            head = currentNode.getNext();
        } else if (toRemove == lastIndex) {
            for (int i = 0; i < lastIndex - 1; i++) {
                head = currentNode.getNext();
            }
            tail = currentNode;
        } else {
            for (int i = 0; i < toRemove; i++) {
                if (i == toRemove - 1) {
                    buffer = currentNode.getNext();
                    nextNode = buffer.getNext();
                    currentNode.setNext(nextNode);
                }
            }
        }
    }

    public boolean isIndexLast() {
        return tail == null;
    }

    public Integer getSize(Node<T> currentHead) {
        Integer count = 0;
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
