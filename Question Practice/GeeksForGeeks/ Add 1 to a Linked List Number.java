class Solution {
    // Node definition
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Reverse the linked list
    private Node reverse(Node head) {
        Node prev = null, curr = head, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public Node addOne(Node head) {
        // Step 1: Reverse the linked list
        head = reverse(head);

        // Step 2: Add one to the number represented by the reversed list
        Node curr = head;
        int carry = 1;
        Node prev = null;

        while (curr != null) {
            int sum = curr.data + carry;
            curr.data = sum % 10; // Update the node with the new digit
            carry = sum / 10; // Calculate the carry
            prev = curr;
            curr = curr.next;
        }

        // If there's still a carry after the entire list is processed
        if (carry > 0) {
            prev.next = new Node(carry); // Add a new node for the remaining carry
        }

        // Step 3: Reverse the list again to restore the original order
        return reverse(head);
    }

    // Helper function to print the linked list
    public void printList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            head = head.next;
        }
        System.out.println();
    }
}

// view question description - https://www.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1