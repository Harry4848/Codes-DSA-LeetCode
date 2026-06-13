package DSA.Topic.StackWithLinkedList;

public class Stack {
    private Node top;
    public Stack(){
        this.top=null;
    }
    // Push Operations
    public void pushElement(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
    // Pop Operation
    public int popElement(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }else {
            int value = top.data;
            top = top.next;
            return value;
        }
    }
    // Peek Operation
    public int peekElement(){
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }else {
            return top.data;
        }
    }
    // Check Operation
    public boolean isEmpty(){
        if (this.top==null){
            return true;
        }else {
            return false;
        }
    }
    // Display Operations
    public void displayElements(){
        if (this.top==null){
            System.out.println("Stack is Empty !");
            return ;
        }else {
            Node temp = top;
            while (temp!=null){
                System.out.print(temp.data+"   ");
                temp = temp.next;
            }
        }
    }
}
