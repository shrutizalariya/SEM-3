import java.util.Scanner;
public class Swaparrayelement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of array:");
        int n = sc.nextInt();
        int swap[] = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("swap["+i+"] = ");
            swap[i] = sc.nextInt();
        }

        System.out.println("Take a number in array which you want swap:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int indexa = 0;
        int indexb = 0;
        for(int i=0;i<n;i++){
            if(swap[i]==a){
                indexa=i;
            }
            if(swap[i]==b){
                indexb=i;
            }
        }
        int temp = 0;
        temp = swap[indexa];
        swap[indexa] = swap[indexb];
        swap[indexb] = temp;

        System.out.println("element "+a+" index is = "+indexa);
        System.out.println("element "+b+" index is = "+indexb);

        for(int i=0;i<n;i++){ 
            System.out.print(swap[i]+" ");
        }

    }
}
