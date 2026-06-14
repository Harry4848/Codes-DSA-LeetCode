package DSA.Topic.Queue.CircularQueue;

public class Main {
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(4);
        circularQueue.enQueue(10);
        circularQueue.enQueue(20);
        circularQueue.enQueue(30);
        circularQueue.enQueue(40);
        circularQueue.displayElements();
        System.out.println(circularQueue.peekOperation());
        circularQueue.displayElements();
        System.out.println(circularQueue.deQueue());
        circularQueue.displayElements();
        System.out.println(circularQueue.getSize());
        circularQueue.enQueue(50);
        circularQueue.displayElements();
        System.out.println(circularQueue.peekOperation());
    }
}