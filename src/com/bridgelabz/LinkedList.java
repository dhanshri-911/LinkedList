package com.bridgelabz;

public class LinkedList {
    Node head;
    Node tail;//head

    public void printList() {
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }

    public void insertAfter(Node previousNode,int data){
        if(previousNode == null){
            System.out.println("previous Node cant be null");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = previousNode.next;
        previousNode.next = newNode;
    }
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }
}
