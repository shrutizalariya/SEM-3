//  Write a menu driven program to implement following operations on a circular 
// queue using an Array 
//  Insert 
//  Delete 
//  Display all elements of the queue 

import java.util.*;
class Queue{
    int n;
    int f;
    int r;
    int[] q;
    public Queue(int n){
        this.n = n;
        f=-1;
        r=-1;
        q=new int[n];
    }
    public void enqueue_cq(int y){
        if(r==n-1){
            r=0;
        }else{
            r++;
        }
        if(f==r){
            System.out.println("CQ Overflow");
        }
        q[r]=y;
        if(f==-1){
            f=0;
        }
        System.out.println("Element"+q[r]+"is enqueued");
    }
    public void dequeue_cq(){
        if(f==-1){
            System.out.println("CQ Underflow");
        }
      @SuppressWarnings("unused")
    int y=q[f];
      if(f==r){
        f=r=-1;
      }
      if(f==n-1){
        f=0;
      }else{
        f=(f+1)%n;
      }
      System.out.println("Element"+y+"is dequeued");
    }
    public void display(){
        int i;
        for(i=f;;i=(i+1)%n){
            System.out.print(q[i]);
            if(i==r){
                break;
            }
        }
        System.out.println();
    }
}
public class Lab9_51B {
    public static void main(String[] args) {
        Queue cq = new Queue(5);
        boolean flag = true;
        while(flag){
            System.out.println("Enter 1 to insert element in cq");
            System.out.println("Enter 2 to delete element from CQ");
            System.out.println("Enter 3 to display");
            System.out.println("Enter 4 to exit");
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            int o = sc.nextInt();
            if(o==1){
                System.out.println("Enter the element to beinserted");
                int y = sc.nextInt();
                cq.enqueue_cq(y);
            }
            if (o==2){
                cq.dequeue_cq();                
            }
            if(o==3){
                cq.display();
            }
            if(o==4){
                flag=false;
                break;
            }
        }
    }
}
