package com.bridgelabz;


public class Stack<T>{
    private final LinkedList<T> list;

    public Stack() {
        list = new LinkedList<>();
    }

    public void pushStack(int element) {
        list.add(element);
    }
    public void printStack(){ list.printList();}

    public void stackPop(){
        list.pop();
    }
    public Node<T> stackPeek(){
       return list.peek();
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("----------UC1------------");
        stack.pushStack(70);
        stack.pushStack(30);
        stack.pushStack(56);
        //stack.printStack();

        System.out.println("----------UC2------------");
        //System.out.println("Before Pop");
        //stack.stackPop();
        //System.out.println("After Pop");
        stack.printStack();
        System.out.println("Elemt at the top " +stack.stackPeek().data);
    }
}


