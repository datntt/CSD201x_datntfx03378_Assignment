import java.util.LinkedList;

public class MyQueue {
    LinkedList a = null;
    public MyQueue() {}
    public void enqueue() {}
    public boolean isEmpty() {
        return a == null;
    }
    public Object dequeue() throws Exception {
        if(isEmpty()) throw new Exception();
        return new Person();
    }

    public Object front() throws Exception {
        if(isEmpty()) throw new Exception();
        return a.size();
    }

}
