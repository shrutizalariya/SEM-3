// Write a menu driven program to implement following operations on the doubly 
// linked list. 
//  Insert a node at the front of the linked list. 
//  Delete a node from specified position. 
//  Insert a node at the end of the linked list.
//  Display all nodes.

import java.util.Scanner;

/**
 * 
 * Lab13_72A
 */
public class Lab13_72A {

    class Node {
        int info;
        Node lptr;
        Node rptr;

        public Node(int data){
            this.info = data;
            this.lptr = null;
            this.rptr = null;
        }
    }

    Node first = null;
    Node last = null;

    // Insert a node at the front of the linked list. 
    public void insertAtFront(int data){
        Node newNode = new Node(data);
        Scanner sc = new Scanner(System.in);

        if(first == null){
            first = newNode;
            last = newNode;
            first.lptr = null;
            first.rptr = null;
        }
        else{
            newNode.lptr = null;
            newNode.rptr = first;
            first.lptr = newNode;
            first = newNode;
        }
    }

    // Insert a node at the end of the linked list
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        Scanner sc = new Scanner(System.in);

        if(first == null){
            first = newNode;
            last = newNode;
        }
        else{
            newNode.rptr = null;
            newNode.lptr = last;
            last.rptr = newNode;
            last = newNode;
        }
    }
    
    // Insert a node at the giver position of the linked list
    public void insertAtPosition(int data , int pos){
        Node newNode = new Node(data);
        Scanner sc = new Scanner(System.in);

        if(pos == 1){
            insertAtFront(data);
        }
        else{
            Node current = first;
            int currpos = 0;
            while(current != null && currpos < pos){
                current = current.rptr;
                currpos++;
            }
            if(current == null){
                insertAtEnd(data);
            }
            else{
                newNode.rptr = current;
                newNode.lptr = current.lptr;
                current.lptr.rptr = newNode;
                current.lptr = newNode;
            }
        }
    }

    // Delete a node from specified position. 
    public void DeleteAtPosition(int index){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        Node save = first;

        if(first == null){
            System.out.println("Empty");
        }
        if(first == last){
            first = last = null;
        }
        while (save.rptr != null && count != index) {
            save = save.rptr;
            count ++;
        }
        if(index == 0){
            save.rptr.lptr = null;
            first = save.rptr;
            return;
        }
        if(last == save){
            save.lptr.rptr = null;
            last = save.lptr;
            return;
        }
        save.lptr.rptr = save.rptr;
        save.rptr.lptr = save.lptr;
    }

    // Display all nodes.
    public void Display(){
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.info + " -> ");
            temp = temp.rptr;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Lab13_72A dll = new Lab13_72A();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while(flag){
        System.out.println("Enter 1 for \'insertAtFront\'Enter 2 for \'insertAtEnd\'Enter 3 for \'insertAtPosition\'Enter 4 for \'deleteAtPosition\'Enter 5 for \'display\'");
        int option=sc.nextInt();

        switch (option) {
            case 1: int a = sc.nextInt();
                    int b = sc.nextInt();
                    int a1 = sc.nextInt();
                    dll.insertAtFront(a);
                    dll.insertAtFront(b);
                    dll.insertAtFront(a1);
                break;
            case 2: int c = sc.nextInt();
                    dll.insertAtEnd(c);
                break;
            case 3: System.out.println("Enter a data : ");
                    int d = sc.nextInt();
                    System.out.println("Enter index for insert a node : ");
                    int e = sc.nextInt();
                    dll.insertAtPosition(d, e);
                    break;
            case 4: System.out.println("Please enter index for deleting a node : ");
                    int i = sc.nextInt();
                    dll.DeleteAtPosition(i);
                break;
            case 5: dll.Display();
                break;
            case 6: flag = false;
                    break;
        }
    }
}
}