import java.util.Scanner;
public class AscendingDeleteNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of array:");
        int n = sc.nextInt();

        int asc[] = new int[n];
        int del[] = new int[n-1];

        System.out.println("Enter already sorted array in ascending order");
        for(int i=0;i<n;i++){
            System.err.println("asc["+i+"] = ");
            asc[i] = sc.nextInt();
        }

        System.out.println("Enter element which you want to delete it:");
        int d = sc.nextInt();

        for(int i=0;i<n;i++){
            if(asc[i]<d){
                del[i] = asc[i];
            }
            else if(asc[i]>d){
                del[i-1] = asc[i];
            }
        }

        for(int i=0;i<n-1;i++){
            System.out.print(del[i]+" ");
        }
    }
    
}
