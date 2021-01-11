package pkg1;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtHead(5);
        list.insertAtHead(10);
        list.insertAtHead(15);
        list.insertAtHead(20);
        list.insertAtHead(25);
        list.insertAtHead(30);

        //list.deleteFromHead();

        System.out.println(list);
        System.out.println(("Length: " ) + list.length());
        //System.out.println("Found: " + list.find(15));
    }
}
