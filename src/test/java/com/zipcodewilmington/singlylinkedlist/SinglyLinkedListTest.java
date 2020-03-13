package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    private SinglyLinkedList<String> linkedList;
    private String string1;
    private String string2;
    private String string3;
    private String string4;
    private String string5;
    private String string6;
    private String string7;
    private String string8;
    private String string9;


    @Before
    public void setup(){
        linkedList = new SinglyLinkedList<>();
        string1 = "apple";
        string2 = "orange";
        string3 = "pear";
        string4 = "banana";
        string5 = "dragon fruit";
        string6 = "strawberry";
        string7 = "peach";
        string8 = "watermelon";
        string9 = "pineapple";

        linkedList.add(string1);
        linkedList.add(string2);
        linkedList.add(string3);
        linkedList.add(string4);
        linkedList.add(string5);
        linkedList.add(string6);
        linkedList.add(string7);
        linkedList.add(string8);
        linkedList.add(string9);

    }

    @Test
    public void testConstructor() {
        SinglyLinkedList<String> linkedList = new SinglyLinkedList<>();
        int actualSize = linkedList.getSize();
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

        int actualSize = linkedList.getSize();
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

        int actualSize = linkedList.getSize();
        int expectedSize = 4;

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
    public void testRemovingAValueByIndex() {
        linkedList.remove(2);

        int actualSize = linkedList.getSize();
        int expectedSize = 8;

        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void removeLastIndex() {
        linkedList.remove(9);

        int actualSize = linkedList.getSize();
        int expectedSize = 8;

        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testRemovingTheFirstIndex() {
        linkedList.remove(1);

        int actualSize = linkedList.getSize();
        int expectedSize = 8;

        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testRemovingTheLastIndex() {
        linkedList.remove(4);

        int actualSize = linkedList.getSize();
        int expectedSize = 8;

        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testGetElementAtIndex() {
        Assert.assertEquals("orange", linkedList.getNodeAtIndex(2));
    }

    @Test
    public void testGetElementAtIndex2() {
        Assert.assertEquals("apple", linkedList.getNodeAtIndex(1));
    }

    @Test
    public void testGetElementAtIndex3() {
        Assert.assertEquals("banana", linkedList.getNodeAtIndex(4));
    }

    @Test
    public void testGetElementAtIndex4() {


        Assert.assertEquals("strawberry", linkedList.getNodeAtIndex(6));
    }

    @Test
    public void checkIfEmpty() {
        SinglyLinkedList<String> linkedList= new SinglyLinkedList<>();
        Assert.assertTrue(linkedList.isEmpty());
    }

    @Test
    public void testContains() {
        Assert.assertTrue(linkedList.contains(string4));
    }

    @Test
    public void testContainsFirst() {
        Assert.assertTrue(linkedList.contains(string1));
    }

    @Test
    public void testContainsFirst2() {
        Assert.assertFalse(linkedList.contains("broccoli"));
    }

    @Test
    public void testFind() {
        Assert.assertEquals(1, linkedList.find("apple"));
    }

    @Test
    public void testFind1() {
        Assert.assertEquals(3, linkedList.find("pear"));

    }

    @Test
    public void testFind2() {
        Assert.assertEquals(4, linkedList.find("banana"));
    }

    @Test
    public void testCopy() {
        SinglyLinkedList<String> copy = linkedList.copy();

        Assert.assertEquals(linkedList.getNodeAtIndex(1), copy.getNodeAtIndex(1));
        Assert.assertEquals(linkedList.getNodeAtIndex(2), copy.getNodeAtIndex(2));
        Assert.assertEquals(linkedList.getNodeAtIndex(3), copy.getNodeAtIndex(3));
        Assert.assertEquals(linkedList.getNodeAtIndex(0), copy.getNodeAtIndex(0));

    }
}
