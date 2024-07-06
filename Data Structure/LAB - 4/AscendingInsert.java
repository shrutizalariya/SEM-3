import java.util.Scanner;
public class AscendingInsert {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a length of array:");
        int n = sc.nextInt();

        int asc[] = new int[n];
        int ins[] = new int[n+1];

        for(int i=0;i<n;i++){
            System.err.println("asc["+i+"] = ");
            asc[i] = sc.nextInt();
        }

        int temp = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(asc[i]>asc[j]){
                    temp = asc[i];
                    asc[i] = asc[j];
                    asc[j] = temp;
                }
            }
        }

        System.out.println("Enter a element:");
        int e = sc.nextInt();

        int index = 0;
        for(int i=0;i<n;i++){
            if(asc[i]<e){
                index = i+1;
            }
        }

        for(int i=0;i<n+1;i++){
            if(i<index){
                ins[i] = asc[i];
            }
            else if(i==index){
                ins[i] = e;
            }
            else if(i>index){
                ins[i] = asc[i-1];
            }
        }

        for(int i=0;i<n+1;i++){
            System.out.println(ins[i]+" ");
        }

    }
}
