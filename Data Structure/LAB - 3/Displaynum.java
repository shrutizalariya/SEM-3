import java.util.Scanner;
public class Displaynum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of array:");
        int n = sc.nextInt();
        int num[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("num["+i+"] = ");
            num[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(num[i]);
        }
    }
}
