import com.bridgelabz.LinkedList;

public class Queue {
    private final LinkedList list;

    public Queue() {
        list = new LinkedList();
    }

    public void enqueue(int data) {
        list.addLast(data);
    }

    public void printQueue() {
        list.printList();
    }

    public void dequeue(){
        list.popLast();
    }
    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println("-----------UC3-------------");
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.printQueue();
        System.out.println("-------------UC4-------------");
        queue.dequeue();
        queue.printQueue();
    }

}

