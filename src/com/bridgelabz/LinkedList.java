package com.bridgelabz;

public class  LinkedList<T> {
    Node<T> head;
    Node<T> tail;//head

    public void printList() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    void deleteNode(int position) {
        if (head == null) //empty
            return;
        Node temp = head; //store head
        if (position == 0) {
            head = temp.next; //change head
            Node<T> next = temp.next.next;
            return;
        }
        //find privious node
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;
        //more than num of nodes
        if (temp == null || temp.next == null)
            return;
        //temp next node to be deleted
        Node next = temp.next.next;
        temp.next = next;
        return;
    }


    public void insertAfter(Node <T> previousNode,T data){
        if(previousNode == null){
            System.out.println("previous Node cant be null");
            return;
        }
        Node <T> newNode = new Node <T> (data);
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

    public Node search(T data){
        Node temp = head;
        while(temp != null){
            if(temp.data == data) {
                return temp;
            }
            temp = temp.next;
            System.out.println(data);
        }
        return null;
    }

    public void popLast() {
        Node <T>  temp = head;
        Node <T> prevNode = null;
        while (temp.next != null) {
            prevNode = temp;
            temp = temp.next;
        }
        prevNode.next = null;
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

