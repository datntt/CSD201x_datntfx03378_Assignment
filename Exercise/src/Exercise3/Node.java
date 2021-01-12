package Exercise3;

public class Node {
    private int info;
    private Node next;
    Node(int x, Node p) {
        info = x;
        next = p;
    }
    Node(int x) {
        this(x, null);
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
