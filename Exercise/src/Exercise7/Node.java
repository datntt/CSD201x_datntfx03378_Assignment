package Exercise7;

public class Node<T> {
    int info;
    Node left, right;
    Node() {}
    Node(int x) {
        info = x;
        left = right = null;
    }
}
