// Write a program to implement Shell Sort using Array. 

import java.util.Scanner;

public class Lab22_99B {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        shellSort();
    }

    public static void shellSort(){
        System.out.println("Enter array length");
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i =0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        for(int gap = n/2 ; gap >=1 ; gap = gap/2){
            for(int j = gap ; j < n ; j++){
                for(int i = j-gap ; i >= 0 ; i = i - gap){
                    if(arr[i+gap] > arr[i]){
                        break;
                    }
                    else{
                        int temp = arr[i+gap];
                        arr[i+gap] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }

        System.out.println("Sorted Array :");
        for(int i = 0; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
