// Write a program to implement Selection Sort using Array. 

import java .util.*;

class Sort3{
    Scanner sc = new Scanner(System.in);

    public void selection_Sort() {
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < arr.length ; i++){
            System.out.println("arr[" +i+ "] : " );
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < arr.length ; i++){
            int min_index = i;
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            if(min_index != i){
                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;
            }
        }       
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
public class Lab20_94A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Sort3 s = new Sort3(); 
        s.selection_Sort();
    }
}
