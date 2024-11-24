// WAP to check whether 2 singly linked lists are same or not. 

import java.util.*;
public class Lab10_59C{
    class Node{
        int info;
        Node link;

        public Node(int data){
            this.info = data;
            this.link = null;
        }
    }
    Node first = null;

    public void insertinLL1(int data){
        Node n1 = new Node(data);
        if(first==null){
            first = n1;
        }
        else{
            n1.link = first;
            first = n1;
        }
    }
        Node begin = null;

        public void insertinLL2(int data){
            Node n2 = new Node(data);
            if(begin==null){
                begin = n2;
            }
            else{
                n2.link = begin;
                begin = n2;
            }
        }
            public void check(){
                int counta = 0;
                int countb = 0;
                Node temp1 = first;
                Node temp2 = begin;
        
                while (temp1!=null) {
                    counta++;
                    temp1 = temp1.link;
                }
                while (temp2!=null) {
                    countb++;
                    temp2 = temp2.link;
                }
                if(counta!=countb){
                    System.out.println("Lists are not same");
                }
                else{
                    temp1 = first;
                    temp2 = begin;
                    while(temp1!=null && temp2!=null){
                        if(temp1.info == temp2.info){
                            counta--;
                            countb--;
                            temp1 =temp1.link;
                            temp2 = temp2.link;
                        }else{
                            break;
                        }
                    }
                    if(counta==0 && countb==0){
                        System.out.println("Lists are same");
                    }else{
                        System.out.println("Data of list is not same");
                    }
                }
            }
    public static void main(String[] args) {
        Lab10_59C c = new Lab10_59C();
        while(true){
            System.out.println("Enter 1 to insert in 1st Linked List");
            System.out.println("Enter 2 to insert in 2nd Linked List");
            System.out.println("Enter 3 for break");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the option:");
            int o = sc.nextInt();
            if(o==1){
                int x = sc.nextInt();
                c.insertinLL1(x);
            }
            if(o==2){
                int x = sc.nextInt();
                c.insertinLL2(x);
            }
            if (o==3) {
                c.check();
                break;
            }
        }
    }
}