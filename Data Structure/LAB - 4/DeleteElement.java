import java.util.Scanner;
    public class DeleteElement {
        public static void main(String []args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a size of array:");
            int n = sc.nextInt();

            int num[] = new int[n];
            int num1[] = new int[n-1];

            for(int i=0;i<n;i++){
                System.out.println("num["+i+"] = ");
                num[i] = sc.nextInt();
            }

            System.out.println("Enter a index where you want to delete a number:");
            int I = sc.nextInt();

            for(int i=0;i<n;i++){
                if(i<I){
                   num1[i] = num[i];
                }
                else if(i>I){
                    num1[i-1] = num[i]; 
                }
            }

            for(int i=0;i<n-1;i++){
                System.out.print(num1[i]+" ");
            }
        }
    }