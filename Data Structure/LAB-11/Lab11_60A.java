// Write a program to implement stack using singly linked list.

import java.util.Scanner;

class Stack{
    class Node{
        int info;
        Node link;

        public Node(int data){
            this.info = data;
            this.link = null;
        }
    }
    Node first = null;
    public void push(int data){
        Node n = new Node(data);
        if(first == null){
            first = n;
        }else{
            n.link = first;
            first = n;
        }
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
public class Lab11_60A{
    public static void main(String[] args) {
        Stack s = new Stack();
        while(true){
        System.out.println("Enter 1 to push the node in ll");
        System.out.println("Enter 2 to pop the node from ll");
        System.out.println("Enter 3 to display");
        System.out.println("Enter 4 to exit");
        Scanner sc = new Scanner(System.in);
        int o = sc.nextInt();
        if(o==1){
            int x = sc.nextInt();
            s.push(x);
        }
        if (o==2) {
            s.pop();
        }
        if (o==3) {
            s.display();
        }
        if (o==4) {
            break;
        }
        }   
    }
}