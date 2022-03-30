package com.bridgelabz;

public class  LinkedList<T> {
    Node <T> head;
    Node <T> tail;//head

    public void printList() {
        Node <T> temp = head;
        while (temp != null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    public void insertAfter(Node<T> previousNode,T data){
        if(previousNode == null){
            System.out.println("previous Node cant be null");
            return;
        }
        Node <T> newNode = new Node <T>(data);
        newNode.next = previousNode.next;
        previousNode.next = newNode;
    }
     public void pop(){
        if(head == null){
            System.out.println("List is empty");
        }
        head = head.next;
    }
    public void add(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void push(T data) {
        Node <T> newNode = new Node<T>(data);
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
