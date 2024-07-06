import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length:");
        int n = sc.nextInt();
        int num[] = new int[n];
        
        for(int i=0;i<n;i++){
           System.out.println("num["+i+"] = ");
           num[i] = sc.nextInt();
        }

        int max = num[0];
        int min = num[0];
        int maxindex = 0;
        int minindex = 0;

        for(int i=1;i<n;i++){
            if(num[i]<min){
                min = num[i];
                minindex = i;
            }
            if(num[i]>max){
                max = num[i];
                maxindex = i;
            }
        }

        System.out.println("position of smallest number is  = "+minindex);
        System.out.println("position of largest number is = "+maxindex);

    }
}
