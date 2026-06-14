package DSA.Topic.StackWithArrays;
public class Stack {
    private int[] array;
    private int maxSize;
    private int top ;
    public Stack(int size){
        this.maxSize = size;
        array = new int[maxSize];
        top = -1;
    }
    // Push Operation Elements
    public void pushElement(int data){
        if (top == maxSize-1){
            System.out.println("Stack is Full !");
            return;
        } else {
            top++;
            array[top] = data;
        }
    }
    // Check empty
    public boolean isEmpty(){
        return top == -1;
    }
    // Pop Operations
    public int popElements(){
        if (isEmpty()){
            System.out.println("Stack is Empty !");
            return -1;
        } else {
            int popped = array[top];
            top--;
            return popped;
        }
    }
    // Peek Operations
    public int peekElements(){
        if (isEmpty()){
            System.out.println("Stack is Empty !");
            return -1;
        }else {
            return array[top];
        }
    }
    // Display Elements
    public void displayElements(){
        if (isEmpty()){
            System.out.println("Stack is Empty ");
        }
        for (int i=0; i<=top; i++){
            System.out.print(array[i]+" , ");
        }
        System.out.println();
    }
}