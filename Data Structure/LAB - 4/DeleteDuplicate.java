import java.util.Scanner;
    public class DeleteDuplicate {
        public static void main(String []args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a length of array:");
            int n = sc.nextInt();
            int arr[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("arr["+i+"] = ");
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    for(int k=j;k<n-1;k++){
                        arr[k] = arr[k+1];
                    }
                    j--;
                    n--;
                }
            }
        }
      
        System.out.println("Array  after deleting duplicate number:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
