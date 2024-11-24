// WAP to split a circular linked list into two halves. 

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Lab13_74B {
    Node first;

    void CircularLinkedList() {
        first = null;
    }

    // Function to insert a node at the end of the circular linked list
    void insert(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            newNode.next = first;
        } else {
            Node temp = first;
            while (temp.next != first) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = first;
        }
    }

    // Function to split the circular linked list into two halves
    void splitList(Lab13_74B firstHalf, Lab13_74B secondHalf) {
        if (first == null) return;

        Node slowPtr = first;
        Node fastPtr = first;

        // Find the middle using the slow and fast pointer approach
        while (fastPtr.next != first && fastPtr.next.next != first) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        // If there are even nodes, fastPtr.next.next will be first, else it will be first.next
        if (fastPtr.next.next == first) {
            fastPtr = fastPtr.next;
        }

        // Set the firsts of the two halves
        firstHalf.first = first;
        if (first.next != first) {
            secondHalf.first = slowPtr.next;
        }

        // Make the first half circular
        slowPtr.next = firstHalf.first;

        // Make the second half circular
        fastPtr.next = secondHalf.first;
    }

    // Function to print the circular linked list
    void printList() {
        if (first == null) return;

        Node temp = first;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != first);
        System.out.println();
    }

    public static void main(String[] args) {
        Lab13_74B list = new Lab13_74B();

        // Insert nodes into the circular linked list
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Original Circular Linked List:");
        list.printList();

        Lab13_74B firstHalf = new Lab13_74B();
        Lab13_74B secondHalf = new Lab13_74B();

        // Split the list into two halves
        list.splitList(firstHalf, secondHalf);

        System.out.println("First Half:");
        firstHalf.printList();

        System.out.println("Second Half:");
        secondHalf.printList();
    }
}
