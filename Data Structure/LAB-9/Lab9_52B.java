// . Write a menu driven program to implement following operations on the 
// Doubled Ended Queue using an Array 
//  Insert at front end, Insert at rear end 
//  Delete from front end, Delete from rear end 
//  Display all elements of the queue

import java.util.*;

class DQueue {
    int n;
    int f;
    int r;
    int q[];

    public DQueue(int n) {
        this.n = n;
        f = -1;
        r = -1;
        q = new int[n];
    }

    public void enqueue(int y) {
        if (r >= n) {
            System.out.println("Queue Overflow");
        } else {
            r = r + 1;
            q[r] = y;
        }
        if (f == -1) {
            f = f + 1;
        }
        System.out.println("Element is enqueued");
    }

    public void dequeue() {
        if (f == -1) {
            System.out.println("Queue Underflow");
        }
        int y = q[f];
        if (f == r) {
            f = r = -1;
        } else {
            f++;
        }
        System.out.println("Element" + " " + +y + "is dequeued");
    }

    public void dqinsert_front(int y) {
        if (f == 0) {
            System.out.println("Queue Overflow");
        }
        if (f == -1) {
            f = 0;
        } else {
            f--;
        }
        q[f] = y;
        System.out.println("Enqueued at front");
    }

    public void delete_rear() {
        if (r == -1) {
            System.out.println("Queue underflow");
        }
        @SuppressWarnings("unused")
        int y = q[r];
        if (r == f) {
            r = f = -1;
        } else {
            r--;
        }
        System.out.println("Element dequeued");
    }

    public void display() {
        int i = f;
        int count = n;

        while (count > 0) {
            System.out.print(q[i] + " ");
            i = (i + 1) % n;
            count--;
        }
    }
}

public class Lab9_52B {
    public static void main(String[] args) {
        DQueue qi = new DQueue(5);
        System.out.println("Enter the element to be queued");
        boolean flag = true;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        while (flag) {
            System.out.println("Enter 1 to enqueue:");
            System.out.println("Enter 2 to dequeue");
            System.out.println("Enter 3 to display");
            System.out.println("Enter 4 to enqueue in front:");
            System.out.println("Enter 5 to dequeue in rear");
            System.out.println("Enter 6 to exit");
            int o = sc.nextInt();
            if (o == 1) {
                int y = sc.nextInt();
                qi.enqueue(y);
            }
            if (o == 2) {
                qi.dequeue();
            }
            if (o == 3) {
                qi.display();
            }
            if (o == 4) {
                int y = sc.nextInt();
                qi.dqinsert_front(y);
            }
            if (o == 5) {
                qi.delete_rear();
            }
            if (o == 6) {
                flag = false;
                break;
            }
        }

    }

}