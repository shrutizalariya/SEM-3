// Write a menu driven program to implement following operations on the 
// circular linked list. 
//  Insert a node at the front of the linked list. 
//  Delete a node from specified position. 
//  Insert a node at the end of the linked list. 
//  Display all nodes. 

import java.util.*;

/**
 * Lab13_71A
 */
public class Lab13_71A {

class Node{
    int info;
    Node link;

    public Node(int data){
        this.info = data;
        this.link = link;
    }
}

Node first = null;
Node last = null;

// Insert a node at the front of the linked list.
public void insertAtFront(int data){
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter number for insertion : ");
    // int i = sc.nextInt();
    Node newNode = new Node(data);

    if(first == null){
        newNode.link = newNode;
        first = last = newNode;
    }
    else{
        newNode.link = first;
        last.link = newNode;
        first = newNode;
    }
}

// Insert a node at the end of the linked list.
public void insertAtEnd(int data){
    Node newNode = new Node(data);

    if(first == null){
        newNode.link = newNode;
        first = last = newNode;
    }
    else{
        newNode.link = first;
        last.link = newNode;
        last = newNode;
    }
}

//Insert a node at the order of the linked list.
public void insertAtOrder(int data){
    Node newNode = new Node(data);

    if(first == null){
        first = last = newNode;
        newNode.link = newNode;
        return;
    }
    if(newNode.info <= first.info){
        newNode.link = first;
        last.link = newNode;
        first = newNode;
        return;
    }
    
    Node save = first;

    while(save != last && newNode.info >= save.link.info){
        save = save.link;
    }

    newNode.link = save.link;
    save.link = newNode;

    if(save == last){
        last = newNode;
    }
}

// Delete a node from specified position. 
public void DeleteAtPosition(int pos){
    Node pred = first;
    Node save = first.link;

    if(pred.info == pos){
        first = first.link;
    }
    while(save.info != pos){
        pred = save;
        save = save.link;
    }
    pred.link = save.link;
}

// Display all nodes.
public void display(){
    Node current;
    current = first;
    do{
        System.out.print(current.info + " -> ");
        current = current.link;
    }while(current != first);
       System.out.println(" ");
}

public static void main(String[] args) {
    Lab13_71A cllist = new Lab13_71A();
    boolean flag = true;
    Scanner sc = new Scanner(System.in);
    while (flag) {
        System.out.println("Enter 1 for \'insertAtfront\'Enter 2 for \'insertAtEnd\'Enter 3 for \'insertAtOrder\'Enter 4 for \'delete\'Enter 5 for \'deleteLast\'Enter 6 for \'display\'");
        int option=sc.nextInt();

        switch (option) {
            case 1:cllist.insertAtFront(1);
                   cllist.insertAtFront(2);
                   cllist.insertAtFront(3);
                break;
            case 2: cllist.insertAtEnd(1);
                    cllist.insertAtEnd(2);
                    cllist.insertAtEnd(3);
                break;
            case 3: cllist.insertAtOrder(4);
                    cllist.insertAtOrder(0);
                    cllist.insertAtOrder(1);
            // cllist.insertAtOrder(0);
                break;
            case 4: cllist.DeleteAtPosition(1);
                break;
            // case 5: llist.deleteLast();
            //     break;
            case 6: cllist.display();
                break;
            case 7: flag=false;
                break;
        }
    }
}
}
