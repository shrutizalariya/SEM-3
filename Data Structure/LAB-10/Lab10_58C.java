// Write a program to count the number of nodes in a singly circularly linked list.

public class Lab10_58C {
class Node{
    int info;
    Node link;

    public Node(int data){
        this.info = data;
        this.link = null;
    }
}
    Node first = null;
    public void insert(int x){
        Node n = new Node(x);
        if(first==null){
            first = n;
        }else{
            n.link = first;
            first = n;
        }
        display();
    }
    
    public void countNode(){
        int count = 0;
        while (first!=null) {
            count++;
            first = first.link;
        }
        System.out.println(count);
        
    }
    public void display(){
        Node value = first;
        while(value!=null){
            System.out.print(value.info+"->");
            value = value.link;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Lab10_58C cn = new Lab10_58C();
        cn.insert(3);
        cn.insert(2);
        cn.insert(1);
        cn.countNode();        
    }    
}