package DSA.Topic.Queue.SimpleQueue;

public class Main {
    public static void main(String[] args) {
        SimpleQueue simpleQueue = new SimpleQueue(4);
        simpleQueue.enQueue(10);
        simpleQueue.enQueue(20);
        simpleQueue.enQueue(30);
        simpleQueue.enQueue(40);
        simpleQueue.displayElements();
        System.out.println(simpleQueue.deQueue());
        simpleQueue.displayElements();
        System.out.println(simpleQueue.peekOperation());
        simpleQueue.displayElements();
    }
}
