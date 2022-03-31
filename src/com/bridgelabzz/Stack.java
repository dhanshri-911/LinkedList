package com.bridgelabzz;

import com.bridgelabz.LinkedList;

public class Stack<K>{
    private final LinkedList<K> list;

    public Stack() {
        list = new LinkedList<>();
    }

    public void pushStack(int element) {
        list.add(element);
    }
    public void printStack(){ list.printList();}

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("----------UC1------------");
        stack.pushStack(70);
        stack.pushStack(30);
        stack.pushStack(56);
        stack.printStack();

    }
}


