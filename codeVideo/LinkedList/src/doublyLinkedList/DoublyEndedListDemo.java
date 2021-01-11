package doublyLinkedList;

import doublyLinkedList.DoublyEndedList;

public class DoublyEndedListDemo {
    public static void main(String[] args) {
        DoublyEndedList dList = new DoublyEndedList();

        dList.insertAtTail(19);
        dList.insertAtTail(18);
        dList.insertAtTail(17);

        System.out.println(dList);
    }

    public static class DoublyLinkedNode {
        private int data;
        private DoublyLinkedNode nextNode;
        private DoublyLinkedNode previousNode;

        public DoublyLinkedNode (int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public DoublyLinkedNode getNextNode() {
            return nextNode;
        }

        public void setNextNode(DoublyLinkedNode nextNode) {
            this.nextNode = nextNode;
        }

        public DoublyLinkedNode getPreviousNode() {
            return previousNode;
        }

        public void setPreviousNode(DoublyLinkedNode previousNode) {
            this.previousNode = previousNode;
        }
    }
}
