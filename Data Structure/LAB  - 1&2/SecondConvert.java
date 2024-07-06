import java.util.Scanner;
public class SecondConvert{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time in second:");
        int n = sc.nextInt();
        
        int h = 0;
        int m = 0;
        int s = 0;

        h = n/3600;
        m = (n-(h*3600))/60;
        s = (n-((h*3600)+(m*60)));

        System.out.println("Time = "+h+":"+m+":"+s);

    }
}