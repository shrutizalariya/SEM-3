// Write a program to implement a Binary Search using Array.

import java.util.*;

class Search{

    public void Binary_Search(){

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
                System.out.println(arr[middle] +" Element is at index " +middle);
                return;
            }
            else if(arr[middle] <= key){
                left = middle + 1;
            }
            else{
                right = middle - 1;
            }
            return;
        }
        System.out.println("Element not found !! ");
        return;
    }

}
public class Lab18_91A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Search s = new Search(); 
        s.Binary_Search();
    }
}
