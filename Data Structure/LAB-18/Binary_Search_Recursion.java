// Write a program to implement Binary_Search using Recursion.

import java.util.*;

class Search1{

    public void binary_Search(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of an array : ");
        int n = sc.nextInt();
        int left = 0;
        int right = n-1;
        int middle;
        int[] arr = new int[n];
        int key;

        for(int i = 0 ; i < arr.length ; i++){
            System.out.println("arr[" +i+ "] : " );
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter key : ");
        key = sc.nextInt();

        while (left <= right) {
             middle = (left + right)/2;

            if (arr[middle] == key) {
                System.out.println("Element " + arr[middle] + " is found at index " + middle);
                binary_Search();
                return;
            }
            else if(arr[middle] <= key){
                left = middle + 1;
            }
            else{
                right = middle - 1;
            }
        }
        System.out.println("Element not found !! ");
        return;
    }
}
public class Binary_Search_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Search1 s = new Search1(); 
        s.binary_Search();
    }
}
