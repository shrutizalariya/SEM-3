// Write a program to implement Heap Sort using Array. 

import java.util.*;

public class Lab22_98A {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        heapSort();
    }

    public static void heapify(int arr[] , int n , int i){
        int maxindex = i ;
        int leftChild = 2*i+1;
        int rightChild = 2*i+2;

        if(leftChild < n && arr[leftChild] > arr[maxindex]){
            maxindex = leftChild;
        }
        if(rightChild < n && arr[rightChild] > arr[maxindex]){
            maxindex = rightChild;
        }
        if(i != maxindex){
            int temp = arr[i];
            arr[i] = arr[maxindex];
            arr[maxindex] = temp;
            heapify(arr , n , maxindex);
        }
    }

    public static void buildMaxHeap(int arr[]){
        int n = arr.length;
        for(int i = n/2-1 ; i>=0 ; i--){
            heapify(arr,n,i);
        }
    }

    public static void heapSort(){
        System.out.println("Enter array length : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0 ; i<=n-1 ; i++){
            arr[i] = sc.nextInt();
        }
        buildMaxHeap(arr);
        for(int i=n-1 ; i>=0 ; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,i,0);
        }
        System.out.println("Sorted Array");
        for(int i=0 ; i<=n-1 ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
