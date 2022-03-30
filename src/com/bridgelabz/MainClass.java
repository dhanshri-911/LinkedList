package com.bridgelabz;

public class MainClass {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        //System.out.println("----------------UC1----------------");
        //list.add(56);
        //list.add(30);
        //list.add(70);
        //list.printList();

        System.out.println("----------------UC2----------------");
       // list.push(70);
        //list.push(30);
        //list.push(56);
        // list.printList();

        System.out.println("----------------UC3----------------");
       // list.add(56);
        //list.add(70);
        //list.insertAfter(list.head,30);
        //list.printList();


        System.out.println("----------------UC5----------------");
        //list.add(56);
        //list.add(30);
       // list.add(70);
        //list.popLast();
        //list.printList();

        System.out.println("----------------UC7----------------");
       // list.add(56);
        //list.add(30);
        //list.add(70);
        //list.search(30);
        //list.printList();

        System.out.println("----------------UC8---------------");
       // list.add(56);
        //list.add(30);
        //list.add(70);
        //list.insertAfter(list.head.next,40);
        //list.printList();
        //System.out.println();

        System.out.println("----------------UC9---------------");
        list.add(56);
        list.add(30);
        list.add(40);
        list.add(70);
        System.out.println("created List..");
        list.printList();
        list.deleteNode(2);
        System.out.println("Linked List after delete node");
        list.printList();
    }
}
