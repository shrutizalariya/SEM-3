import java.util.Scanner;
public class AddMatrix{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int ans[][] = new int[2][2];

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.err.println("a["+i+"]["+j+"] = ");
                a[i][j] = sc.nextInt();
                System.err.println("b["+i+"]["+j+"] = ");
                b[i][j] = sc.nextInt();
            }
        }

        // for(int i=0;i<2;i++){
        //     for(int j=0;j<2;j++){
        //         System.err.println("b["+i+"]["+j+"] = ");
        //         b[i][j] = sc.nextInt();
        //     }
        // }

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                ans[i][j] = a[i][j] + b[i][j];
            }
        }

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(ans[i][j]+" ");
            }
                System.out.println();
        }
    }
}
