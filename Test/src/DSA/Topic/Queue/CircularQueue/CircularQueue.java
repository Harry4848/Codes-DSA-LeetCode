package DSA.Topic.Queue.CircularQueue;

public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    public CircularQueue(int capacity){
        this.capacity=capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }
    // Insert the Data From rear : Enqueue
    public void enQueue(int data){
        if (size==capacity){
            System.out.println("Queue Is Full !");
            return;
        }
        rear=(rear+1)%capacity;
        queue[rear] = data;
        size++;
    }
    // Delete the Data From Front : Dequeue
    public int deQueue(){
        if (size==0){
            System.out.println("Queue is Empty ! ");
            return -1;
        }
        int data = queue[front];
        front = (front+1)%capacity;
        size--;
        return data;
    }
    // to check size of elements
    public int getSize(){
        return this.size;
    }
    // Peek Operation
    public int peekOperation(){
        if (size==0){
            System.out.println("Queue is Empty ! ");
            return -1;
        }
        return queue[front];
    }
    // Display Elements
    public void displayElements(){
        if (size==0){
            System.out.println("Queue is Empty ! ");
            return ;
        }
        for (int i=0; i<size; i++){
            System.out.print(queue[(front+i)%capacity]+"   ");
        }
        System.out.println();
    }
}