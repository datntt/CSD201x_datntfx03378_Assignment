public class MyBTree {
    Node root;
    MyBTree() {
        root = null;
    }

    // isEmpty
    public boolean isEmpty() {
        return root == null;
    }
    // search
    public void search (Node p, String key) {
        if(p.getInfo().getID() == null) {
            System.out.println("Not found ID");
            return;
        }
        if(p.getInfo().getID().equals(key)) {
            visit(p);
            return;
        }
        if(CharSequence.compare(p.getInfo().getID(), key) > 0) {
            search(p.getLeft(), key);
        } else {
            search(p.getRight(), key);
        }

    }

    // visit
    public void visit(Node p) {
        System.out.print(p.getInfo() + " ");
    }

    //insert
    public void insert(Staff staff) {
        Node q = new Node(staff);
        if(isEmpty()) {
            root = q;
            return;
        }
        Node f, p;
        f = null;
        p = root;
        while (p != null) {
            if(p.getInfo().getID().equals(staff.getID())) {
                System.out.println("ID already exists, cannot insert...");
            }
            f = p;
            if(CharSequence.compare(p.getInfo().getID(), staff.getID()) > 0) {
                p = p.getLeft();
            } else {
                p = p.getRight();
            }
        }
        assert f != null;
        if(CharSequence.compare(f.getInfo().getID(), staff.getID()) > 0) {
            f.setLeft(q);
        } else {
            f.setRight(q);
        }
    }
    // inorder a tree
    public void inOrder(Node p) {
        if(p == null) return;
        inOrder(p.getLeft());
        visit(p);
        inOrder(p.getRight());
    }

}