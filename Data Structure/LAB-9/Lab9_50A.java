// Write a menu driven program to implement following operations on the Queue 
// using an Array 
//  ENQUEUE 
//  DEQUEUE 
//  DISPLAY 

import java.util.Scanner;

class Queue{
    int n;
    int R;
    int F;
    int Q[];
    int y;

    public Queue(int n){
        this.n = n;
        R = -1;
        F = -1;
        Q = new int[n];
    }

public void ENQUEUE(int y){
    if (R >= n){
        System.out.println("Queue Overflow !!");
        return;
    }
    else{
        R++;
        Q[R] = y;
    }
    if(F == -1){
        F = 0;
    }
    System.out.println("Element is Enqueued");
}

public void DEQUEUE(){
    if(F == -1){
        System.out.println("Queue Underflow");
        return;
    }
   int y = Q[F];
    // else{
        
    // }
    if( F == R){
        F = R = -1;
    }
    else{
        F ++ ;
    }
      System.out.println("Element"+" "+ +y+ "is dequeued");
}

public void display(){
    for (int i=F ; i<=R ; i++){
        System.out.print(Q[i] + " ");
    }
}

}
public class Lab9_50A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // System.out.println("Enter length of an array : ");
        // int n = sc.nextInt();
        Queue q = new Queue(5);

        boolean flag = true;
            
        while (flag) {
            System.out.println("Enter 1 for \\'Enqueue\\'Enter 2 for \\'Dequeue\\'Enter 3 for \\'Display\\'Enter 4 for \\'Exit\\'");
            int o = sc.nextInt();
            switch (o) {
                case 1:
                    int y = sc.nextInt();
                    q.ENQUEUE(y);           
                    break;
                case 2:
                    q.DEQUEUE();
                    break;
                case 3:
                    System.out.print("Answer = ");
                    q.display();
                    System.out.println();
                    break;
                case 4:
                    flag = false;
                    break;
            }
        }
    }
}
