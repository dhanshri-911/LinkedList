package com.bridgelabz;

public class MainClass {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(56);
        Node second = new Node(30);
        Node third = new Node(70);

        list.head.next = second;
        second.next = third;
        list.printList();

    }
}
