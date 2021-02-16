package Exercise7;

public class BTree {
    Node root;
    BTree() {
        root = null;
    }
    boolean isEmpty() {
        return root == null;
    }
    // Hàm tìm kiếm
    void search(Node p, int x) {
        if(p == null) {
            return;
        }
        search(p.left, x);

        if(p.info > x) {
            visit(p);
        }

        search(p.right, x);
    }

    // insert
    void insert(int x) {
        Node q = new Node(x);
        if(isEmpty()) {
            root = q;
            return;
        }
        Node f, p;
        f = null;
        p = root;
        while (p != null) {
            if(p.info == x) {
                System.out.println("The key " + x + " already exists, no insertion.");
                return;
            }
            f = p;
            if(x < p.info) {
                p = p.left;
            } else {
                p = p.right;
            }
        }
        if(x < f.info) {
            f.left = q;
        } else {
            f.right = q;
        }
    }
    // insert []
    void insertMany(int[] a) {
        for(int i : a) {
            insert(i);
        }
    }
    // display
    void visit(Node p) {
        System.out.print(p.info + " ");
    }
    // Duyệt theo thứ tự pre Order.
    void preOrder(Node p) {
        if(p == null) {
            return;
        }
        visit(p);
        preOrder(p.left);
        preOrder(p.right);
    }
    // Duyệt theo thứ tự in Order.
    void inOrder(Node p) {
        if(p == null) {
            return;
        }
        inOrder(p.left);
        visit(p);
        inOrder(p.right);
    }
}
