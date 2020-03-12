package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

import javax.xml.soap.Node;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {


    @Test
    public void testConstructor() {
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();
        int actualSize = linkedList.getSize(linkedList.getHead());
        int expectedSize = 0;

        Assert.assertEquals(expectedSize, actualSize);
        Assert.assertNull(linkedList.getHead());
        Assert.assertNull(linkedList.getTail());
    }

    @Test
    public void testAddition() {
        String stringTest = "YOY";
        SinglyLinkedList<String> linkedList = new SinglyLinkedList();
        linkedList.add(stringTest);

        int actualSize = linkedList.getSize(linkedList.getHead());
        int expectedSize = 1;

        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testAdditionBy2() {
        String stringTest = "YOY";
        String stringTestAgain = "YoY";
        String andAnother = "yeet";
        SinglyLinkedList<String> linkedList= new SinglyLinkedList();
        linkedList.add(stringTest);
        linkedList.add(stringTestAgain);
        linkedList.add(andAnother);

        int actualSize = linkedList.getSize(linkedList.getHead());
        int expectedSize = 3;

        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testAdditionNullary() {
        SinglyLinkedList<String> linkedList= new SinglyLinkedList<>();

        int actualSize = linkedList.getSize(linkedList.getHead());
        int expectedSize = 0;

        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testRemovingAValueByIndex() {
        SinglyLinkedList<String> linkedList= new SinglyLinkedList<>();

        String emily = ("Emily");
        String moran = ("Moran");
        String emma = "Emma";
        linkedList.add(emily);
        linkedList.add(moran);
        linkedList.add(emma);

        int actualSizeBeforeRemoveal = linkedList.getSize(linkedList.getHead());
        int expectedSizeBeforeRemove = 3;

        linkedList.remove(2);

        int actualSize = linkedList.getSize(linkedList.getHead());
        int expectedSize = 2;

        Assert.assertEquals(expectedSizeBeforeRemove, actualSizeBeforeRemoveal);
        Assert.assertEquals(expectedSize, actualSize);
    }

}
