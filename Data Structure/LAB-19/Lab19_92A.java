// Write a program to implement Bubble using Array.

import java .util.*;

class Sort1{
    Scanner sc = new Scanner(System.in);
    public void bubble_Sort() {
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < arr.length ; i++){
            System.out.println("arr[" +i+ "] : " );
            arr[i] = sc.nextInt();
        }

        int last = n-1;
        for(int i = 0 ; i < last ; i++){
            int exchs = 0;
        for(int j = 0 ; j < last ; j++){
            if(arr[i] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = arr[j];
                exchs++;
            }
            if(exchs == 0){
                System.out.println("Array is already sorted !!");
                return;
            }
            else{
                last-- ;
            }
        }
        for(int j = 0 ; j < arr.length ; j++){
            System.out.print(arr[j] + " ");
        
    }
   
}
}
}

/**
 * Lab19_92A
 */
public class Lab19_92A {

    public static void main(String[] args) {
        Sort1 s = new Sort1();
        s.bubble_Sort();
    }
}