package DSA.Topic.StackWithArrays;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(4);
        stack.pushElement(10);
        stack.pushElement(20);
        stack.pushElement(30);
        stack.pushElement(40);
        stack.displayElements();
        System.out.println(stack.popElements());
        stack.displayElements();
        System.out.println(stack.peekElements());
        stack.displayElements();
    }
}
