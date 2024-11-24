// Write a program to sort elements of a linked list.

import java.util.*;
class LL{
    class Node{
        int info;
        Node link;
        public Node(int data){
            this.info = data;
            this.link = null;
        }
    }
    Node first = null;
    public void insert(int data){
        Node n = new Node(data);
        if(first==null){
            first=n;
        }else{
            n.link = first;
            first = n;
        }
    }
    public void sort(){
        Node save = first;
        Node temp1 = null;
        Node temp2 = null;
        while(save!=null){
            temp1 = save;
            temp2 = save.link;
            while (temp2!=null) {
                if(temp2.info < temp1.info){
                    int temp3 = temp1.info;
                    temp1.info = temp2.info;
                    temp2.info = temp3;
                }
                temp2 = temp2.link;
            }
            save = save.link;
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
public class Lab12_65B {
    public static void main(String[] args) {
        LL l = new LL();
        while(true){
        System.out.println("Enter 1 to insert node in ll");
        System.out.println("Enter 2 sort the ll");
        System.out.println("Enter 3 to display");
        System.out.println("Enter 4 to exit");
        Scanner sc = new Scanner(System.in);
        int o = sc.nextInt();
        if(o==1){
            int x = sc.nextInt();
            l.insert(x);
        }
        if (o==2) {
            l.sort();
        }
        if(o==3){
            l.display();
        }
        if (o==4) {
            break;
        }
        }
    }
}