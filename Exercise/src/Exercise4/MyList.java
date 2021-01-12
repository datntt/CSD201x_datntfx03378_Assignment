package Exercise4;

public class MyList {
    Node head, tail;
    MyList() {
        head = tail = null;
    }
    public void clear() {
        head = tail = null;
    }
    // Hàm thêm 1 người vào đuôi danh sách móc lối
    public void add(Person x) {

    }
    // Hàm thêm nhiều người vào danh sách móc lối, thông tin(tên và tuổi) của mọi người được lưu trong 2 mảng a và b
    public void addMany(String[] a, int[] b) {

    }
    // Hàm duyệt danh sách móc lối.
    public void traverse() {

    }
    // Hàm sắp xếp theo tên
    public void sortByName() {}

    // main
    public static void main(String[] args) {
        String[] a = {"HOA","HA","LAN","NOI","MUA","NAY"};
        int[] b = {25,17,26,19,23,21};
        MyList t = new MyList();
        t.addMany(a, b);

        System.out.println("Traverse: ");
        t.traverse();

        System.out.println("Sort by name: ");
        t.sortByName();
        t.traverse();
        System.out.println();
    }
}
