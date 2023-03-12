package com.blz.day14assignment;

import java.io.PrintStream;

import java.util.LinkedList;

public class Operations {

    public static LinkedList addeElementAtStart() {

        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);

        return linkedList;
    }

    public static void addElementAtEnd() {
        LinkedList linkedList = new LinkedList();


    }

    public static void insertInBetween() {
        LinkedList linkedList = new LinkedList();

        Node newNode = new Node(30);
    }

    public static void deleteFirstNode() {
        LinkedList linkedList = addeElementAtStart();
        Node deletedNode = (Node) linkedList.pop();
        System.out.println("Delete Node is" + deletedNode.data);
    }

    public static void deleteLastNode() {
        System.out.println("before");
        LinkedList linkedList = addeElementAtStart();
        System.out.println("After");
    }

    public static void searchNodeBaseOnValue() {
        LinkedList linkedList = addeElementAtStart();

    }

    public static void insertAtGivenNode() {
        System.out.println("Before Insertion");
        LinkedList linkedList = addeElementAtStart();
        Node newNode = new Node(40);
        System.out.println("After Insertion");

    }

    public static void deleteInBetweenNode() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(40);
        linkedList.push(30);
        linkedList.push(56);
        System.out.println("Before deleting");
        linkedList.pop();
        System.out.println("After deleting");
        int size = linkedList.size();
        System.out.println("LinkedList size is " + size);
    }

    public static void sortNode() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(40);
        linkedList.push(30);
        linkedList.push(56);
        System.out.println("Before");
        System.out.println("After");
    }
}
