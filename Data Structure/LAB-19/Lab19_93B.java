//  Write a program to implement Insertion Sort using Array. 

import java.util.*;

class Sort2{
    Scanner sc = new Scanner(System.in);
    
    public void insertion_Sort1(){
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < arr.length ; i++){
            System.out.println("arr[" +i+ "] : " );
            arr[i] = sc.nextInt();
        }

        int i = 1;

        while (i < n) {
            int key = arr[i];
            int j = i-1;
        
        while (j >= 0 && arr[j] > key) {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = key;
        i++;
    }
    for(int k = 0; k < arr.length; k++) {
        System.out.print(arr[k] + " ");
    }

    }
}
/**
 * Lab19_93B
 */
public class Lab19_93B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sort2 s = new Sort2();
        s.insertion_Sort1();
    }
}