package DSA.Topic.DEQueue;

public class DEQueue {
    private int[] queue;
    private int capacity;
    private int front;
    private int rear;
    private int size;
    public DEQueue(int capacity){
        this.capacity=capacity;
        this.queue=new int[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }
    // Check Queue is full or not
    public boolean isFull(){
        return size == capacity;
    }
    // Check Queue is empty or not;
    public boolean isEmpty(){
        return size==0;
    }
    // Insert the Data From Front End : Enqueue
    public void insertFromFront(int data){
        if (isFull()){
            System.out.println("Queue Is Full ! ");
            return;
        }
        if (isEmpty()){
            front = 0;
            rear = 0;
        } else if (front==0) {
            front = capacity-1;
        }else {
            front--;
        }
        queue[front] = data;
        size++;
    }
    // Insert the Data From Rear End : Enqueue
    public void insertFromRear(int data){
        if (isFull()){
            System.out.println("Queue Is Full ! ");
            return;
        }
        if (isEmpty()){
            front = 0;
            rear = 0;
        } else if (rear == capacity-1) {
            rear = 0;
        }else {
            rear++;
        }
        queue[rear] = data;
        size++;
    }
    // Delete the Data from Front End : Dequeue
    public int deleteFromFront(){
        if (isEmpty()){
            System.out.println("Queue Is Empty ! ");
            return -1;
        }
        int data = queue[front];
        if (front==rear){
            rear = -1;
            front = -1;
        } else if (front==capacity-1) {
            front=0;
        }else {
            front++;
        }
        size--;
        return data;
    }
    // Delete The Data From Rear End : Dequeue
    public int deleteFromRear(){
        if (isEmpty()){
            System.out.println("Queue Is Empty ! ");
            return -1;
        }
        int data = queue[rear];
        if (front==rear){
            front = -1;
            rear = -1;
        } else if (rear==0) {
            rear = capacity-1;
        }else {
            rear--;
        }
        size--;
        return data;
    }
    // Get Front Element
    public int getFront(){
        if (isEmpty()){
            System.out.println("Queue is Empty ! ");
            return -1;
        }
        return queue[front];
    }
    // Get Rear Element
    public int getRear(){
        if (isEmpty()){
            System.out.println("Queue is Empty ! ");
            return -1;
        }
        return queue[rear];
    }
    // Display Operation
    public void displayElements(){
        if (isEmpty()){
            System.out.println("Queue is Empty ! ");
            return ;
        }
        for (int i=0; i<size; i++){
            System.out.print(queue[(front+i)%capacity]+"\t");
        }
        System.out.println();
    }
    // Get Size
    public int getSize(){
        return size;
    }
}
