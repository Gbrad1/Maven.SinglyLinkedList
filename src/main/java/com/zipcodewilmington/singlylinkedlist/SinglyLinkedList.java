package com.zipcodewilmington.singlylinkedlist;

import java.util.logging.Logger;

/**
 * Created by leon on 1/10/18.
 * By: Giles Bradford | collaborated with Jimmy Churu
 * Date: 09-March-2020
 *
 */
public class SinglyLinkedList<T> {

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
        Node<T> nextNode;
        Node<T> buffer;
        int lastIndex = getSize() - 1;

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

    public boolean contains(T value) {
        int count = 0;
        Node<T> currentNode = head;
        while (currentNode.getElement() != value) {
            currentNode = currentNode.getNext();
            count++;
            if (count == getSize()) {
                break;
            }
        }

        if (count != getSize()) {
            return true;
        }
        return false;
    }

    public int find(T value) {
        int count = 0;
        int indexFound = 0;
        Node<T> currentNode = head;
        for (int i = 0; i < getSize(); i++) {
            count++;
            if (currentNode.getElement() == value) {
                indexFound = count;
            }
            currentNode = currentNode.getNext();
        }
        return indexFound;
    }

    public Integer getSize() {
        Integer count = 0;
        Node<T> link = head;
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

    public T getNodeAtIndex(int index) {
        Node<T> currentNode = head;
        T link = null;
        if (index == (getSize() - 1)) {
            link = tail.getElement();
        } else if (index > 1) {
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.getNext();
                link = currentNode.getElement();
            }
        } else {
            link = currentNode.getElement();
        }
        return link;
    }

    public SinglyLinkedList<T> copy() {
        SinglyLinkedList<T> copiedLinkedList = new SinglyLinkedList<>();
        Node<T> currentHead = head;
        while (currentHead != null) {
            copiedLinkedList.add(currentHead.getElement());
            currentHead = currentHead.getNext();
        }
        return copiedLinkedList;
    }

    public boolean isEmpty() {
        return(head == null);
    }

}
