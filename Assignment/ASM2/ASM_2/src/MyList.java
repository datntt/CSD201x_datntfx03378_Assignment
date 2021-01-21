public class MyList<Product> {
    Node<Product> head;
    Node<Product> tail;
    //
    public MyList(Node<Product> head, Node<Product> tail) {
        this.head = head;
        this.tail = tail;
    }
    public MyList() {
        head = tail = null;
    }

    boolean isEmpty() {
       return head == null;
    }


    // insert to tail
    public void insertAfter(Product sp) {
        Node<Product> newNode = new Node<>(sp);
        if(isEmpty()) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        this.tail = newNode;
    }

    public void clear(){
        head = tail = null;
    }
    //
    public void traverse() {
        Node<Product> p = head;
        while (p != null) {
            System.out.println(p);
            p = p.next;
        }
    }




}
