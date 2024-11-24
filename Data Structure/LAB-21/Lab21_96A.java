import java.util.*;

public class Lab21_96A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int low = 0;
        int high = n - 1;

        mergeSort(a, low, high);

        System.out.println("Sorted array:");
        for (int k = 0; k <= high; k++) {
            System.out.print(a[k] + " ");
        }
    }

    public static void mergeSort(int[] a, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(a, low, mid);
            mergeSort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
    }

    public static void merge(int[] a, int low, int mid, int high) {
        int[] b = new int[a.length];
        int h = low, i = low, j = mid + 1;

        while (h <= mid && j <= high) {
            if (a[h] <= a[j]) {
                b[i] = a[h];
                h++;
            } 
            else {
                b[i] = a[j];
                j++;
            }
            i++;
        }

        while (h <= mid) {
            b[i] = a[h];
            h++;
            i++;
        }

        while (j <= high) {
            b[i] = a[j];
            j++;
            i++;
        }

        for (int k = low; k <= high; k++) {
            a[k] = b[k];
        }
    }
}
