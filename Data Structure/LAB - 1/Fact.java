import java.util.Scanner;
public class Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println(ans);
    }
    static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
