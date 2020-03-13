package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;
import java.util.logging.Logger;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    private static final Logger LOGGER = Logger.getLogger(SinglyLinkedList.class.getName());

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
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();
        linkedList.add(stringTest);

        int actualSize = linkedList.getSize(linkedList.getHead());
        int expectedSize = 1;

        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testAdditionBy2() {
        String string1 = "YOY";
        String string2 = "YoY";
        String string3 = "yeet";
        String string4 = "yaYeet";
        SinglyLinkedList<String> linkedList= new SinglyLinkedList<>();
        linkedList.add(string1);
        linkedList.add(string2);
        linkedList.add(string3);
        linkedList.add(string4);

        int actualSize = linkedList.getSize(linkedList.getHead());
        int expectedSize = 4;

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

        String string1 = "apple";
        String string2 = "orange";
        String string3 = "pear";
        String string4 = "banana";
        linkedList.add(string1);
        linkedList.add(string2);
        linkedList.add(string3);
        linkedList.add(string4);

        linkedList.remove(2);

        int actualSize = linkedList.getSize(linkedList.getHead());
        int expectedSize = 3;

        //Assert.assertEquals(expectedSizeBeforeRemove, actualSizeBeforeRemoval);
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void removeLastIndex() {
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();
        String string1 = "apple";
        String string2 = "orange";
        String string3 = "pear";
        String string4 = "banana";
        linkedList.add(string1);
        linkedList.add(string2);
        linkedList.add(string3);
        linkedList.add(string4);

        linkedList.remove(3);

        int actualSize = linkedList.getSize(linkedList.getHead());
        int expectedSize = 3;

        LOGGER.info("\n" + linkedList.getHead());
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testRemovingTheFirstIndex() {
        SinglyLinkedList<String> linkedList= new SinglyLinkedList<>();

        String string1 = "apple";
        String string2 = "orange";
        String string3 = "pear";
        String string4 = "banana";
        linkedList.add(string1);
        linkedList.add(string2);
        linkedList.add(string3);
        linkedList.add(string4);

        linkedList.remove(1);

        int actualSize = linkedList.getSize(linkedList.getHead());
        int expectedSize = 3;

        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testRemovingTheLastIndex() {
        SinglyLinkedList<String> linkedList= new SinglyLinkedList<>();

        String string1 = "apple";
        String string2 = "orange";
        String string3 = "pear";
        String string4 = "banana";
        linkedList.add(string1);
        linkedList.add(string2);
        linkedList.add(string3);
        linkedList.add(string4);

        linkedList.remove(4);

        int actualSize = linkedList.getSize(linkedList.getHead());
        int expectedSize = 3;

        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testGetElementAtIndex() {
        SinglyLinkedList<String> linkedList= new SinglyLinkedList<>();

        String string1 = "apple";
        String string2 = "orange";
        String string3 = "pear";
        String string4 = "banana";
        linkedList.add(string1);
        linkedList.add(string2);
        linkedList.add(string3);
        linkedList.add(string4);

        int actualSize = linkedList.getSize(linkedList.getHead());
        int expectedSize = 4;

        Assert.assertEquals("orange", linkedList.getNodeAtIndex(2));
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testGetElementAtIndex2() {
        SinglyLinkedList<String> linkedList= new SinglyLinkedList<>();

        String string1 = "apple";
        String string2 = "orange";
        String string3 = "pear";
        String string4 = "banana";
        linkedList.add(string1);
        linkedList.add(string2);
        linkedList.add(string3);
        linkedList.add(string4);

        Assert.assertEquals("apple", linkedList.getNodeAtIndex(1));
    }

    @Test
    public void testGetElementAtIndex3() {
        SinglyLinkedList<String> linkedList= new SinglyLinkedList<>();

        String string1 = "apple";
        String string2 = "orange";
        String string3 = "pear";
        String string4 = "banana";
        linkedList.add(string1);
        linkedList.add(string2);
        linkedList.add(string3);
        linkedList.add(string4);

        Assert.assertEquals("banana", linkedList.getNodeAtIndex(4));
    }

    @Test
    public void testGetElementAtIndex4() {
        SinglyLinkedList<String> linkedList= new SinglyLinkedList<>();

        String string1 = "apple";
        String string2 = "orange";
        String string3 = "pear";
        String string4 = "banana";
        String string5 = "dragon fruit";
        String string6 = "strawberry";
        String string7 = "peach";
        String string8 = "watermelon";
        String string9 = "pineapple";

        linkedList.add(string1);
        linkedList.add(string2);
        linkedList.add(string3);
        linkedList.add(string4);
        linkedList.add(string5);
        linkedList.add(string6);
        linkedList.add(string7);
        linkedList.add(string8);
        linkedList.add(string9);

        Assert.assertEquals("strawberry", linkedList.getNodeAtIndex(6));
    }

    @Test
    public void checkIfEmpty() {
        SinglyLinkedList<String> linkedList= new SinglyLinkedList<>();
        Assert.assertTrue(linkedList.isEmpty());
    }

    @Test
    public void testContains() {
        SinglyLinkedList<String> linkedList= new SinglyLinkedList<>();

        String string1 = "apple";
        String string2 = "orange";
        String string3 = "pear";
        String string4 = "banana";
        linkedList.add(string1);
        linkedList.add(string2);
        linkedList.add(string3);
        linkedList.add(string4);

        Assert.assertTrue(linkedList.contains(string4));
    }

    @Test
    public void testContainsFirst() {
        SinglyLinkedList<String> linkedList= new SinglyLinkedList<>();

        String string1 = "apple";
        String string2 = "orange";
        String string3 = "pear";
        String string4 = "banana";
        linkedList.add(string1);
        linkedList.add(string2);
        linkedList.add(string3);
        linkedList.add(string4);

        Assert.assertTrue(linkedList.contains(string1));
    }

    @Test
    public void testContainsFirst2() {
        SinglyLinkedList<String> linkedList= new SinglyLinkedList<>();

        String string1 = "apple";
        String string2 = "orange";
        String string3 = "pear";
        String string4 = "banana";
        linkedList.add(string1);
        linkedList.add(string2);
        linkedList.add(string3);
        linkedList.add(string4);

        Assert.assertFalse(linkedList.contains("broccoli"));
    }

    @Test
    public void testFind() {
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();

        String string1 = "apple";
        String string2 = "orange";
        String string3 = "pear";
        String string4 = "banana";
        linkedList.add(string1);
        linkedList.add(string2);
        linkedList.add(string3);
        linkedList.add(string4);

        Assert.assertEquals(1, linkedList.find("apple"));

    }

    @Test
    public void testFind1() {
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();

        String string1 = "apple";
        String string2 = "orange";
        String string3 = "pear";
        String string4 = "banana";
        linkedList.add(string1);
        linkedList.add(string2);
        linkedList.add(string3);
        linkedList.add(string4);

        Assert.assertEquals(3, linkedList.find("pear"));

    }

}
