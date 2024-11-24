// Write a program to implement queue using singly linked list. 

import java.util.Scanner;

class Queue{
    class Node{
        int info;
        Node link;

        public Node(int data){
            this.info = data;
            this.link = null;
        }
    }
    Node first = null;
    public void push(int x){
        Node n = new Node(x);
        if(first == null){
            first = n;
            return;
        }
        Node save = first;
        while(save.link!=null){
            save = save.link;
        }
        save.link = n;
    }
    public void pop(){
        if(first == null){
            System.out.println("Stack  underflow");
        }else{
            first = first.link;
        }
    }
    public void display(){
        while(first!=null){
            System.out.print(first.info+" ");
            first = first.link;
        }
        System.out.println();
    }
}
public class Lab11_61B {
    public static void main(String[] args) {
        Queue q = new Queue();
        while(true){
        System.out.println("Enter 1 to push the node in ll");
        System.out.println("Enter 2 to pop the node from ll");
        System.out.println("Enter 3 to display");
        System.out.println("Enter 4 to exit");
        Scanner sc = new Scanner(System.in);
        int o = sc.nextInt();
        if(o==1){
            int x = sc.nextInt();
            q.push(x);
        }
        if (o==2) {
            q.pop();
        }
        if (o==3) {
            q.display();
        }
        if (o==4) {
            break;
        }

        }   
    }
}