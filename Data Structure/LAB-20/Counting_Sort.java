// Counting Sort 

import java.util.*;

/**
 * Counting_Sort
 */
public class Counting_Sort {

    public static void countingSort(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        int [] a = new int [n];

        for(int i=0 ; i<n ; i++){
            System.out.print("a["+i+"] = ");
            a[i] = sc.nextInt();
        }

        int max = a[0];

        for(int i=0 ; i <a.length ; i++){
            if(a[i] > max){
                max = a[i];
            }
        }

        int [] c = new int [max+1];

        for(int i=0 ; i <max ; i++){
            c[i] = 0;
        }

        for(int j=0 ; j<a.length ; j++){
            c[a[j]] ++;
        }

        for(int i=1 ; i<c.length ; i++){
            c[i] = c[i] + c[i-1];
        }

        int [] b = new int[n];

        for(int i=b.length-1 ; i>=0 ; i--){
            b[c[a[i]]-1] = a[i];
            c[a[i]] -- ;
        }
        //printArr(a);
        for(int k=0 ; k<b.length ; k++){
            System.out.println(b[k]);
        }
    }

    // public static void printArr(int[] a){
    //     System.out.println("Sorted Array : ");
    //     for(int i=0 ; i<b.length ; i++){
    //         System.out.println(b[i]);
    //     }
    // }

    public static void main(String[] args) {
        countingSort();
    }
}