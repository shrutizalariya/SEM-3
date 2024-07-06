import java.util.Scanner;
public class Primenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

         int flag=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=1;
            }
        }
        if(flag==1){
            System.out.println("Number is not prime");
        }
        else{
            System.out.println("Number is prime");
        }
    }
}
