package DSA.Topic.Queue.SimpleQueue;

public class SimpleQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    public SimpleQueue(int capacity){
        this.capacity=capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
    }
    // Insert Data From Rear End : Enqueue
    public void enQueue(int data){
        if (rear==capacity-1){
            System.out.println("Queue is Full !");
            return;
        }
        rear++;
        queue[rear] = data;
        System.out.println(data+" is Inserted ");
    }
    // Remove Data From Front End : Dequeue
    public int deQueue(){
        if (front>rear){
            System.out.println("Queue is Empty !");
            return -1;
        }
        int data = queue[front];
        front++;
        return data;
    }
    // Peek Operation
    public int peekOperation(){
        if (front>rear){
            System.out.println("Queue is Empty !");
            return -1;
        }
        return queue[front];
    }
    // Display Operation
    public void displayElements(){
        if (front>rear){
            System.out.println("Queue is Empty !");
            return;
        }
        for (int i=front; i<=rear; i++){
            System.out.print(queue[i]+"   ");
        }
        System.out.println();
    }
}
