import java.util.Scanner;
public class Duplicatenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        int flag=0;
        for(int i=0;i<n;i++){
            System.out.println("arr["+i+"] = ");
            arr[i] = sc.nextInt();
        }

        int b = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    b = arr[i];
                    flag = 1;
                }
            }
        }

        if(flag==1){
            System.out.println("This array contains a duplicate num "+b);
        }
        else{
            System.out.println("This array not contains a duplicate num");
        }

    }
}
