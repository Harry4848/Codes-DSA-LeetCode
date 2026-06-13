package DSA.Topic.StackWithLinkedList;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.displayElements();
        stack.pushElement(10);
        stack.pushElement(20);
        stack.pushElement(30);
        stack.displayElements();
        stack.popElement();
        System.out.println();
        stack.displayElements();
        System.out.println();
        System.out.println(stack.peekElement());
        stack.displayElements();
    }
}
