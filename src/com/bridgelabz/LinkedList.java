package com.bridgelabz;

public class LinkedList {
    Node head; //head

    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data + "");
            n = n.next;
        }
    }
}

