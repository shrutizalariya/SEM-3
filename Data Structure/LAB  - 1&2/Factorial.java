import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        int f=1;
        if(n!=0){
        for(int i=1;i<=n;i++){
            f=i*f;
        }
        System.out.println(f);
        }
        else if(n==0){
            System.out.println("1");
        }
}
}