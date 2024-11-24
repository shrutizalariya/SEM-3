// Write a menu driven program to implement following operations on the singly 
// linked list.  
//  Insert a node at the front of the linked list. 
//  Display all nodes. 
//  Delete a first node of the linked list. 
//  Insert a node at the end of the linked list. 
//  Delete a last node of the linked list. 
//  Delete a node from specified position. 

import java.util.*;
class LL {
class Node{
        int info;
        Node link;

    public Node (int data){
        this.info=data;
        this.link=null;
    }
}
    public Node first=null;
    public void insertAtFirst(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data a : ");
        int a=sc.nextInt();
        Node n = new Node(a);
        if(first==null){
            first=n;
        }
        else{
            n.link = first;
            first = n;
        }
        display();
    }

    public void insertAtLast(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter data b : ");
        int b=sc.nextInt();
        Node n1 = new Node(b);
        if(first==null){
            first=n1;
        }
        else{
            Node last=first;
                while(last.link != null){
                    last=last.link;
                }
                last.link=n1;
        }
        display();
    }
    public void insertAtOrd(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter data c : ");
        int c=sc.nextInt();
        Node n2 = new Node(c);
        if(first==null){
            first=n2;
        }
        if(n2.info <= first.info){
            n2.link = first;
            first = n2;
        }
        Node save = first;
        while(save.link != null && n2.info >= save.link.info){
            save = save.link;
        }
        n2.link = save.link;
        save = n2;
        display();
    }
    public void delete(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter data d : ");
        int d=sc.nextInt();
        Node n3 = new Node(d);
        if(first==null){
            System.out.println("List is empty !");
        }
        else{
            Node save = first;
            Node pred = null;
            while (save.info != d || save.link !=null) {
                pred = save;
                save = save.link;
            }
            if(save.info != d){
                System.out.println("The data to be deleted does not found !!");
            }
            if(save.info == d){
                save = save.link;
                pred.link = save.link;
            }
        }
        display();
    }
    public void deleteLast(){
        if(first == null){
            System.out.println("List is empty !");
        }
        else{
            Node save = first;
            Node pred = null;
            while (save.link != null) {
                save = save.link;
            }
            pred = save;
            pred.link = null;
        }
        System.out.println("Last element is deleted !!");
        display();
    }
    public void display(){
        Node value=first;
        System.out.println("Linked list : ");
        while(value != null){
            System.out.println(value.info + " -> ");
            value = value.link;
        }
        System.out.println("Null");
    }
}
    public class LAb10_57A {
    public static void main(String[] args) {
        LL llist=new LL();
        boolean flag = true;
        Scanner sc= new Scanner(System.in);
        while (flag) {
            System.out.println("Enter 1 for \'insertAtfirst\'Enter 2 for \'insertAtlast\'Enter 3 for \'insertAtOrd\'Enter 4 for \'delete\'Enter 5 for \'deleteLast\'Enter 6 for \'display\'");
            int option=sc.nextInt();

            switch (option) {
                case 1: llist.insertAtFirst();
                    break;
                case 2: llist.insertAtLast();
                    break;
                case 3: llist.insertAtOrd();
                    break;
                case 4: llist.delete();
                    break;
                case 5: llist.deleteLast();
                    break;
                case 6: llist.display();
                    break;
                case 7: flag=false;
                    break;
            }
        }
    }
}