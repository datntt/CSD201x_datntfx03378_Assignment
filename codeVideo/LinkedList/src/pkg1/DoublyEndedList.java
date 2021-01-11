package pkg1;

public class DoublyEndedList {
    private Node head;
    private Node tail;

    public void insertAtTail(int  data) {
        Node newNode = new Node(data);
        if(this.head == null) {
            this.head = newNode;
        }
         else if(this.tail == null) {
            this.tail = newNode;
        }
         if(this.tail != null) {
             this.tail.setNextNode(newNode);
         }
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
}
