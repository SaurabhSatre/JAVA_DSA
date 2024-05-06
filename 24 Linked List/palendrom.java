import java.util.*;

public class palendrome {

    // Define the Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head and tail of the linked list
    private Node head;
    private Node tail;
    private int size;

    // Constructor
    public Palindrome() {
        head = null;
        tail = null;
        size = 0;
    }

    // Method to add a new node at the end of the list
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Method to print the linked list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Method to find the middle node of the linked list
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Method to check if the linked list is a palindrome
    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true; // Empty or single-node list is considered palindrome
        }

        Node midNode = findMid(head);
        Node prev = null;
        Node curr = midNode;
        Node next;

        // Reverse the second half of the list
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // Right half of the list
        Node left = head; // Left half of the list

        // Compare both halves of the list
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        Palindrome ll = new Palindrome();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);

        System.out.println(ll.checkPalindrome()); // Output should be true
    }
}
