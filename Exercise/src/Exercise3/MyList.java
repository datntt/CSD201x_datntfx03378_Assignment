package Exercise3;

public class MyList {
    Node head, tail;
    MyList() {
        head = tail = null;
    }
    boolean isEmpty() {
        return head == null;
    }
    public void clear() {
        head = tail = null;
    }

    // Hàm thêm 1 phần tử vào đầu danh sách.
    void addHead(int x) {
        Node newNode = new Node(x);
        newNode.setNext(this.head);
        this.head = newNode;
    }

    // Hàm thêm nhiều phần tử vào đầu danh sách.
    void addMany(int[] a) {
        for (int e : a) {
            addHead(e);
        }
    }

    // display
    void visit(Node p) {
        System.out.print(p.getInfo() + " ");
    }

    // Hàm duyệt danh sách
    void traverse() {
        Node p = head;
        while (p != null) {
            visit(p);
            p = p.getNext();
        }
    }

    // Hàm tìm thấy phần tử có giá trị lớn hơn x, nếu tìm thấy hiển thị chỉ số ra màn hình, giả sử phần tử đầu tiên có chỉ số 0;
    void search(int x) {
        Node current = this.head;
        int index = 0;
        while (current != null) {
            if (current.getInfo() != x)
                index++;
            else
                break;
            current = current.getNext();
        }
        if(index < length())
            System.out.println("Search(" + x + "): " + index);
        else
            System.out.println("Search(" + x + "): null");
    }

    // length linked list
    int length() {
        int length = 0;
        Node current = this.head;

        while (current != null) {
            length ++;
            current = current.getNext();
        }
        return  length;
    }

    public static void main(String[] args) {
        MyList t = new MyList();
        int[] a = {7, 9, 2, 8, 6, 3};
        t.addMany(a);
        System.out.print("Traverse: ");
        t.traverse();
        System.out.println();
        int x = 8;
        t.search(x);
    }
}
