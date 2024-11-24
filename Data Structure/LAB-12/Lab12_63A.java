// Write a program to copy a linked list.

import java.util.*;
class Node{
    int info;
    Node link;

    // Constructor
    Node(int data) {
        this.info = data;
        this.link = null;
    }
}
/**
 * Lab12_63A
 */
public class Lab12_63A {

        Node first;

        // Method to add a new node at the end of the list
        void addFirst(int data) {
            Node newNode = new Node(data);

            // If the list is empty, make the new node as first
            if (first == null) {
                first = newNode;
                return;
            } 
            newNode.link = first;
            first = newNode;
        }

        //
        void copyLink(){
            Node pred = first;
            Node save = first.link;

            while (save!=null) {
                Node newNode = new Node(first.info);
                newNode.info = pred.info;
                pred = pred.link;
                newNode.info = save.info;
                save = save.link;
            }
        }

        //for addFirst
        void print(){
            Node temp = first;

            while (temp != null) {
                System.out.print(temp.info + " -> ");
                temp=temp.link;
            }

            //for copysingly
            while (temp != null) {
                System.out.print(temp.info +" -> ");
                temp = temp.link;
            }
            System.out.println("null");
        }
        public static void main(String[] args) {
            Lab12_63A cs = new Lab12_63A();
            cs.addFirst(1);
            cs.addFirst(2);
            cs.addFirst(3);
            cs.addFirst(4);
            System.out.println("Old Linked List is : ");
            cs.print();
            cs.copyLink();
            System.out.println("Copy Linked list is : ");
            cs.print();
    }
}