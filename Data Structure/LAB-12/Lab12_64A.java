// Write a program to reverse a linked list.

import java.util.Scanner;
class ll{
class Node{
    int info;
    Node link;

    //Constructor
    Node(int data){
        this.info = data;
        this.link = null;
    }

/**
 * Lab12_64A
 */
public class Lab12_64A {

    Node first;

    // Method to add a new node at the end of the list
    void addFirst(int data) {
        Node newNode = new Node(data);

        // If the list is empty, make the new node as first
        if (first == null) {
            first = newNode;
            return;
        } 
        else{
            Node temp = first;
            while (temp.link != null) {
                temp = temp.link;
            }
            temp.link = newNode;
        }
    }

    // Node save = first;
    
    //methode to reverse a linked list
    void reverseList(){
        Node prev = null;
        Node current = first;
        Node next = null;

        while(current != null){
            next = current.link;
            current.link = prev;
            prev = current;
            current = next;
        }
        first = prev;
    }
    void printList(){
        Node temp = first;

        while (temp != null) {
            System.out.print(temp.info + " -> ");
            temp=temp.link;
        }
        System.out.println("null");
    }

    public static void main (String[] args) {
        Lab12_64A rl = new Lab12_64A();
        //Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the number of nodes : ");
        // int numNodes = sc.nextInt();

        // for(int i=0;i<numNodes;i++){
        //     System.out.println("Enter data for node "+ (i+1)+ ":");
        //     int data = sc.nextInt();
        //     rl.addFirst(data);
        // }
        
        rl.addFirst(1);
        rl.addFirst(2);
        rl.addFirst(3);
        rl.addFirst(4);
        rl.addFirst(5);
        
        System.out.println("Old linked list : ");
        rl.printList();

        rl.reverseList();

        System.out.println("Reversed linked list : ");
        rl.printList();
    }
}
}
}