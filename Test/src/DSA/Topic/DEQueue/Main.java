package DSA.Topic.DEQueue;

public class Main {
    public static void main(String[] args) {
        DEQueue deQueue = new DEQueue(4);
        deQueue.displayElements();
        deQueue.insertFromFront(10);
        deQueue.insertFromFront(20);
        deQueue.insertFromRear(30);
        deQueue.insertFromRear(40);
        deQueue.displayElements();
        System.out.println(deQueue.deleteFromFront());
        deQueue.displayElements();
        System.out.println(deQueue.deleteFromRear());
        deQueue.displayElements();
        System.out.println(deQueue.getFront());
        System.out.println(deQueue.getRear());
        deQueue.insertFromFront(20);
        deQueue.insertFromRear(40);
        deQueue.displayElements();
        System.out.println(deQueue.getSize());
        deQueue.insertFromRear(50);
        deQueue.displayElements();
    }
}
