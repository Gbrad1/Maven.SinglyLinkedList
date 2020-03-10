package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

import javax.xml.soap.Node;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void testAddition() {
        String stringTest = "YOY";
        SinglyLinkedList<String> linkedList= new SinglyLinkedList<>();
        linkedList.add(stringTest);

        int actualSize = linkedList.getSize();
        int expectedSize = 1;

        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testAdditionNullary() {
        SinglyLinkedList<String> linkedList= new SinglyLinkedList<>();

        int actualSize = linkedList.getSize();
        int expectedSize = 0;

        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testRemovingAvalueByIndex() {
        SinglyLinkedList<String> linkedList= new SinglyLinkedList<>();

        String emily = ("Emily");
        String moran = ("Moran");
        String emma = "Emma";
        linkedList.add(emily);
        linkedList.add(moran);
        linkedList.add(emma);

        int actualSizeBeforeRemoveal = linkedList.getSize();
        int expectedSizeBeforeRemove = 3;

        linkedList.remove(2);

        int actualSize = linkedList.getSize();
        int expectedSize = 2;

        linkedList.printList();

        Assert.assertEquals(expectedSizeBeforeRemove, actualSizeBeforeRemoveal);
        Assert.assertEquals(expectedSize, actualSize);
    }

}
