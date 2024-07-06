import java.util.Scanner;
public class SumOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of array:");
        int k = sc.nextInt();
        int num[] = new int[k];

        System.out.println("Enter starting number of index m:");
        int m = sc.nextInt();

        System.out.println("Enter ending number of index n:");
        int n = sc.nextInt();

        for(int i=0;i<k;i++){
            System.out.println("num["+i+"] = ");
            num[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i=m;i<=n;i++){
            sum = sum+num[i];
        }
        System.out.println("Answer = "+sum);

    }
}
