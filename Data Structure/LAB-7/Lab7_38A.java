// Write a menu driven program to implement following operations on the Stack 
// using an Array 
//  PUSH, POP, DISPLAY 
//  PEEP, CHANGE

import java.util.*;
class Stack{
    int n;
    int TOP;
    int [] s;

    public Stack(int n){
    this.n=n;
    TOP=-1;
    s = new int[n];
    }
    public void push(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an element to be inserted : ");
        int x=sc.nextInt();
        if(TOP>=n){
            System.out.println("Stack Overflow !! ");
        }
        else{
            TOP++;
            s[TOP]=x;
            System.out.println("Element is pushed.");
        }
        display();
    }
    public int pop(){
        if(TOP<=-1){
            System.out.println("Stack Underflow !!");
            return (0);
        }
        else{
            TOP--;
            return(s[TOP+1]);
        }
    }
    public void peep(){

        System.out.println("Enter index i : ");
        int i=sc.nextInt();

        if((TOP-i)<=-1){
            System.out.println("Stack Underflow !!");
        }
        else{
            System.out.println("Peeped Element" +s[TOP-i+1]);
        }
    }
    public void change(){
        System.out.println("Enter index i : ");
        int i=sc.nextInt();

        System.out.println("Enter an element for replace at index "+i+" : ");
        int x=sc.nextInt();

        if(TOP-i+1<=-1){
            System.out.println("Stack Underflow !!");
        }
        else{
            s[TOP-i+1]=x;
            System.out.println(s[TOP-i+1]);
        }
    }
    public void display(){
        for(int i=0;i<=TOP;i++){
            System.out.println(s[i]);
        }
        System.out.println();
    }
}
/**
 * Lab7_38A
 */
public class Lab7_38A {

    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        Stack s = new Stack(5);
        boolean flag = true;
        Scanner sc= new Scanner(System.in);
        while (flag) {
            System.out.println("Enter 1 for \'push\'Enter 2 for \'pop\'Enter 3 for \'peep\'Enter 4 for \'change\'Enter 5 for \'display\'");
            int option=sc.nextInt();

            switch (option) {
                case 1: s.push();
                    break;
                case 2: s.pop();
                    break;
                case 3: s.peep();
                    break;
                case 4: s.change();
                    break;
                case 5: s.display();
                    break;
                case 6: flag=false;
                    break;
            }
        }
    }
}