package Exercise4;

public class MyList {
    Node head, tail;
    MyList() {
        head = tail = null;
    }
    boolean isEmpty() {
        return (head == null);
    }
    // Hàm thêm 1 người vào đuôi danh sách móc lối
    public void add(Person x) {
        Node q = new Node(x);
        if(isEmpty()) {
            head = tail = q;
            return;
        }
        tail.next = q;
        tail = q;
    }
    // Hàm thêm nhiều người vào danh sách móc lối, thông tin(tên và tuổi) của mọi người được lưu trong 2 mảng a và b
    public void addMany(String[] a, int[] b) {
        for(int i = 0;i < a.length; i++) {
            Person person = new Person(a[i], b[i]);
            add(person);
        }
    }
    // Hàm duyệt danh sách móc lối.
    public void traverse() {
        Node p = head;
        while (p != null) {
            System.out.println(p.getInfo() + " ");
            p = p.getNext();
        }
    }
    // Hàm sắp xếp theo tên
    public void sortByName() {
        Node pi, pj;
        Person t;
        pi = head;
        while (pi != null) {
            pj = pi.next;
            while (pj != null) {
                // so sánh name
                if(CharSequence.compare(pi.getInfo().getName(),pj.getInfo().getName()) > 0) {
                    // đổi chỗ node
                    t = pi.getInfo();
                    pi.setInfo(pj.getInfo());
                    pj.setInfo(t);
                }
                pj = pj.next;
            }
            pi = pi.next;
        }
    }
    // main
    public static void main(String[] args) {
        String[] a = {"HOA","HA","LAN","NOI","MUA","NAY"};
        int[] b = {25,17,26,19,23,21};
        MyList t = new MyList();
        t.addMany(a, b);
        System.out.println("Traverse:");
        t.traverse();
        System.out.println();
        System.out.println("Sort by name:");
        t.sortByName();
        t.traverse();
        System.out.println();
    }
}
