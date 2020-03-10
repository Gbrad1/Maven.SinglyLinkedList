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
    private int length = 0;

    public void SinglyLinkedList() {
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
        length++;
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
        length--;
    }

    public Integer getSize() {
        return length;
    }

    public String printList() {
        String toReturn = "";
        for (int i = 0; i < length; i++) {
            toReturn += head.getNext();
            LOGGER.info("\n" + head.getNext());
        }
        return toReturn;
    }

    public boolean isEmpty() {
        return(head == null);
    }

    //Node class ----------------------------------------------------------

}
