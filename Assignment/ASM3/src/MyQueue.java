import java.util.LinkedList;

public class MyQueue {
    LinkedList a = null;
    public MyQueue() {}

    public boolean isEmpty() {
        return a == null;
    }
    public void enqueue(Node node) {
        a.add(node);
    }
    public Object dequeue(){
        return a.removeFirst();
    }


    public Object front() throws Exception {
        if(isEmpty()) throw new Exception();
        return a.size();
    }

}
