// WAP to delete alternate nodes of a doubly linked list. 

public class Lab13_73B {
    Node first; // head of list

    // Doubly linked list node
    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            prev = null;
            next = null;
        }
    }

    // Function to delete alternate nodes
    public void deleteAlternateNodes() {
        if (first == null) return;

        Node current = first;
        while (current != null && current.next != null) {
            
            Node nodeToDelete = current.next;

            current.next = nodeToDelete.next;

            if (nodeToDelete.next != null) {
                nodeToDelete.next.prev = current;
            }

            current = current.next;

        }
    }

    // Function to append a new node at the end
    public void append(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            return;
        }

        Node last = first;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
        newNode.prev = last;
    }

    // Function to print the list
    public void printList() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Lab13_73B dll = new Lab13_73B();

        // Creating the doubly linked list
        dll.append(1);
        dll.append(2);
        dll.append(3);
        dll.append(4);
        dll.append(5);
        dll.append(6);

        System.out.println("Original List:");
        dll.printList();

        dll.deleteAlternateNodes();

        System.out.println("List after deleting alternate nodes:");
        dll.printList();
    }
}
