public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if ( head == null ) {
            createSinglyLinkedList(nodeValue);
            return;
        } else if ( location == 0 ) {
            node.next = head;
            node = head;
        } else if ( location >= size ) {
            node.next = null;
            tail.next = node;
            tail = node;
        }
    }
}
