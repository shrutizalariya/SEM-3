import java.util.Scanner;
public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a length of array:");
        int k = sc.nextInt();
        int []num = new int[k];

        double sum=0;
        for(int i=0;i<k;i++){
            System.out.println("num["+i+"] = ");
            num[i] = sc.nextInt();
        }

        System.out.println("Enter  a index which user want to till do a sum:");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            sum = sum+num[i];
        }

        double Avg=sum/n;

        System.out.println("Average = "+Avg);
    }
}
