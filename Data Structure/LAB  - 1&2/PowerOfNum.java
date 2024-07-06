import java.util.Scanner;

import java.util.Scanner;
public class PowerOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number which power user want to find:");
        int x = sc.nextInt();

        System.out.println("Enetr a power of number:");
        int y = sc.nextInt();

        int ans = 1;
        for( int i=1;i<=y;i++){
            ans = x*ans;
        }

        System.out.println("Answer is = "+ans);
    }
}
