package doublyLinkedList;

import pkg1.Node;

public class DoublyEndedList {
    private Node head;
    private Node tail;

    public void insertAtTail(int  data) {
        Node newNode = new Node(data);
        if(this.head == null) {
            this.head = newNode;
        }
        if(this.tail != null) {
            this.tail.setNextNode(newNode);
        }
            this.tail = newNode;

    }

    @Override
    public String toString() {
        String result = "{";
        Node current = this.head;

        while (current != null) {
            result += current.toString() + ",";
            current = current.getNextNode();
        }
        result += "}";
        return  result;
    }

    public static class DoublyLinkedListDemo {
        public static void main(String[] args) {
            DoublyLinkedList integer = new DoublyLinkedList();

            integer.insertAtHead(1);
            integer.insertAtHead(4);
            integer.insertAtHead(12);
            integer.insertAtHead(34);
            integer.insertAtHead(25);
            integer.insertAtHead(15);
            integer.insertAtHead(10);
            System.out.println(integer);
        }
    }
}
