public class Node{
    private Person info;
    private Node left, right;

    // constructor
    public Node() {}
    public Node(Person info) {
        this.info = info;
        left = right = null;
    }
    // node value smallest
    public Integer smallest() {
        if(left == null) {
            return info.getId();
        }
        return this.left.smallest();
    }

    public Person getInfo() {
        return info;
    }

    public void setInfo(Person info) {
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
