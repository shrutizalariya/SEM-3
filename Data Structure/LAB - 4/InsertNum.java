import java.util.Scanner;
public class InsertNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int arr1[] = new int[n+1];

        for(int i=0;i<n;i++){
            System.out.println("arr["+i+"] = ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter a index which you want to insert a number:");
        int I = sc.nextInt();
        System.out.println("Enter a number which you want to insert in array:");
        int E = sc.nextInt();

        for(int i=0;i<n+1;i++){
            if(i<I){
                arr1[i]=arr[i];
            }
            else if(i==I){
                arr1[i]=E;
            }
            else if(i>I){
                arr1[i]=arr[i-1];
            }
        }

        for(int i=0;i<n+1;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
