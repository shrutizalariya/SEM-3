import java.util.Scanner;
public class SumOfSeries{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number n:");
        int n = sc.nextInt();

        int ans = 0;
        int sum = 0;

        for(int i=1;i<=n;i++){
            ans = ans + i; 
            sum = ans + sum;
        }

        System.out.println("SUM = "+sum);

    }
}