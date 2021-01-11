package doublyLinkedList;

import doublyLinkedList.DoublyEndedListDemo;

public class DoublyLinkedList {

    private DoublyEndedListDemo.DoublyLinkedNode head;

    public void insertAtHead(int data) {
        DoublyEndedListDemo.DoublyLinkedNode newNode = new DoublyEndedListDemo.DoublyLinkedNode(data);
        newNode.setNextNode(this.head);
        if(this.head != null) {
            this.head.setPreviousNode(newNode);
        }
        this.head = newNode;
    }

    public int length() {
        if (head == null)
            return 0;
        int length = 0;
        DoublyEndedListDemo.DoublyLinkedNode current = this.head;

        while (current != null) {
            length += 1;
            current = current.getNextNode();
        }
        return length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        DoublyEndedListDemo.DoublyLinkedNode n = this.head;

        while (n != null) {
            sb.append("Node data: ");
            sb.append(n);
            sb.append("\n");

            n = n.getNextNode();
        }
        return sb.toString();
    }
}
