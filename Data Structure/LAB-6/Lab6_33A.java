//Write a program to swap two numbers using user-defines method.

import java.util.*;

public class Lab6_33A {

    //Method to Swap Two Numbers

public static void swap(int n,int m){
    int temp;
    temp=n;
    n=m;
    m=temp;
    System.out.println(n);
    System.out.println(m);
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Taking input from User

        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter m: ");
        int m = sc.nextInt();

        swap(n,m);

    }
}