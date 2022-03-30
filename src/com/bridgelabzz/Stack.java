package com.bridgelabzz;

import com.bridgelabz.LinkedList;

public class Stack {
    public static void main(String[] args) {


        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("________UC1_________");
        list.push(70);
        list.push(30);
        list.push(56);
        list.printList();

        System.out.println("________UC2_________");
        System.out.println("Before Pop");
        System.out.println("Size " +list.size());
        list.printList();
        while(list.size() != 0){
            list.pop();
        }
        System.out.println("Aftr Pop");
        list.printList();
        System.out.println("the stack is Empty");
        list.push(70);
        list.push(30);
        list.push(56);
        //list.printList();
        list.peek();
        list.printList();
    }
}