// Write a program to implement Quick Sort using Array.

import java.util.Scanner;

public class Lab21_97B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
    }
}