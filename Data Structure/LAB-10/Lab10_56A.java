// Write a program to implement a node structure for singly linked list. Read the 
// data in a node, print the node. 

import java.util.Scanner;

class Node {
    int info;
    Node link;

    // Constructor
    Node(int data) {
        this.info = data;
        this.link = null;
    }

    // Method to display the data of the node
    void printNode() {
        //System.out.println("Node data: " + this.info);
        System.out.print(this.info + " -> ");
    }
}

public class Lab10_56A {
    Node first;

    // Method to add a new node at the end of the list
    void addNode(int data) {
        Node newNode = new Node(data);

        // If the list is empty, make the new node as first
        if (first == null) {
            first = newNode;
        } else {
            Node temp = first;
            while (temp.link != null) {
                temp = temp.link;
            }
            temp.link = newNode;
        }
    }

    // Method to print all nodes in the list
    void printList() {
        Node temp = first;
        while (temp != null) {
            temp.printNode();
            temp = temp.link;
        }
    }

    public static void main(String[] args) {
        Lab10_56A list = new Lab10_56A();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of nodes: ");
        int numberOfNodes = sc.nextInt();

        for (int i = 0; i < numberOfNodes; i++) {
            System.out.println("Enter data for node " + (i + 1) + ": ");
            int data = sc.nextInt();
            list.addNode(data);
        }

        System.out.println("The linked list is: ");
        list.printList();
        
        sc.close();
    }
}
