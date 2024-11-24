// Write a program to implement a Linear Search using Array. 

import java.util.*;
public class Lab18_90A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter an element to be found : ");
        int key = sc.nextInt();

        for(int i = 0 ; i < arr.length ; i++){
            if (arr[i] == key){
                System.out.println("Element " + arr[i] + " is found at index " + i);
                return;
            }
            
        }
        
        System.out.println("Element not found !!");
        return;
    }
}
