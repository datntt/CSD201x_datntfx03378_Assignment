import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyQueue {
    LinkedList<Object> a;
    public MyQueue() {
        a = new LinkedList<>();
    }

    public boolean isEmpty() {
        return a.isEmpty();
    }
    public void enqueue(Object obj) {
        a.add(obj);
    }
    public Object dequeue() {
        return a.removeFirst();
    }

    public Object front(){
        return a.size();
    }

}
