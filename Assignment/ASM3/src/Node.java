public class Node{
    private Staff info;
    private Node left, right;

    // constructor
    public Node() {}
    public Node(Staff info) {
        this.info = info;
        left = right = null;
    }

    public Staff getInfo() {
        return info;
    }

    public void setInfo(Staff info) {
        this.info = info;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
