import java.util.Scanner;
public class MergeArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a length of first array:");
        int n = sc.nextInt();
        System.out.println("Enter a length of second array:");
        int m = sc.nextInt();

        int arr[] = new int[n];
        int arr1[] = new int[m];
        int arr2[] = new int[n+m];

        for(int i=0;i<n;i++){
            System.err.println("arr["+i+"] = ");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<m;i++){
            System.err.println("arr1["+i+"] = ");
            arr1[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            arr2[i] = arr[i];
        }
        for(int i=0;i<m;i++){
            arr2[n+i] = arr1[i];
        }

        for(int i=0;i<n+m;i++){
            System.out.print(arr2[i]+" ");
        }

    }
}
