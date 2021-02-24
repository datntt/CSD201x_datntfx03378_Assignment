public class MyBSTree {
    Node root;
    MyBSTree() {
        root = null;
    }

    // isEmpty
    public boolean isEmpty() {
        return root == null;
    }
    // option 1
    //insert
    public void insert(Person person) {
        Node q = new Node(person);
        if(isEmpty()) {
            root = q;
            return;
        }
        Node f, p;
        f = null;
        p = root;
        while (p != null) {
            // check id exists.
            if(p.getInfo().getID().equals(person.getID())) {
                System.out.println("ID already exists, cannot insert ^_^ ");
                return;
            }
            f = p;
            if(CharSequence.compare(p.getInfo().getID(), person.getID()) > 0) {
                p = p.getLeft();
            } else {
                p = p.getRight();
            }
        }
        //System.out.println(f.getInfo());
        assert f != null;
        if(CharSequence.compare(f.getInfo().getID(), person.getID()) > 0) {
            f.setLeft(q);
        } else {
            f.setRight(q);
        }
    }

    // option 2
    // inorder a tree
    public void inOrder(Node p) {
        if(p == null)
            return;
        inOrder(p.getLeft());
        System.out.println(p.getInfo());
        inOrder(p.getRight());
    }
    public void inOrder() {
        inOrder(root);
    }

    // option 3
    // BST a tree
    public void BST(){
        if(root == null)
            return;
        MyQueue q = new MyQueue();
        q.enqueue(root);
        Node p;
        while (!q.isEmpty()) {
            p = (Node) q.dequeue();
            System.out.println(p.getInfo());
            if(p.getLeft() != null)
                q.enqueue(p.getLeft());
            if(p.getRight() != null)
                q.enqueue(p.getRight());

        }
    }

    // option 4
    // search
    public Node search (Node p, String key) {
        if(p == null) {
            return null;
        }
        if(p.getInfo().getID().equals(key)) {
            return p;
        }
        if(CharSequence.compare(key, p.getInfo().getID()) > 0) {
            return search(p.getLeft(), key);
        } else {
            return search(p.getRight(), key);
        }
    }

}