 //WAP to remove duplicate elements from a singly linked list. 
 
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
    public void removeDup(){
        Node save = first,temp=null;
        while(save!=null){
            temp=save.link;
            while (temp!=null) {
                if(save.info == temp.info){
                    save.link = temp.link;
                }
                temp = temp.link;
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
public class Lab11_62C {
    public static void main(String[] args) {
        LL l = new LL();
        while (true) {
        System.out.println("Enter 1 to insert in ll");
        System.out.println("Enter 2 for removing duplicates");
        System.out.println("Enter 3 for display");
        System.out.println("Enter 4 for exit");
        Scanner sc = new Scanner(System.in);
        int o = sc.nextInt();
        if(o==1){
            int x = sc.nextInt();
            l.insert(x);
        }
        if(o==2){
            l.removeDup();
        }
        if(o==3){
            l.display();
        }
        if(o==4){
            break;
        }
        }
    }
}