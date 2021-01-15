package Exercise5;

import java.util.EmptyStackException;
import java.util.Scanner;

public class MyStack {
    Node head;
    MyStack() {
        head = null;
    }
    boolean isEmpty() {
        return head == null;
    }
    // push e in stack
    public void push(int x) {
        head = new Node(x, head);
    }
    // pop e out stack
    public int pop() {
        if(isEmpty()) throw new EmptyStackException();
        int x = head.getInfo();
        head = head.getNext();
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int x = sc.nextInt();
        MyStack t = new MyStack();
        System.out.print("Output: ");
        t.CovertToBinary(x);
        System.out.println();
    }

    void CovertToBinary(int x) {
        MyStack myStack = new MyStack();
        while (x != 0) {
            int d = x % 2;
            myStack.push(d);
            x /= 2;
        }
        // display stack node elements.
        while (!myStack.isEmpty()) {
            System.out.print(myStack.pop());
        }
    }
}
