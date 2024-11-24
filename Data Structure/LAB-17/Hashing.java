import java.util.*;

public class Hashing{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr= new int[15];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }

    public static void store(int[] arr){
        for(int i=0;i<arr.length;i++){
            int index = hashFn(arr[i]);
            hash[index]=arr[i];
        }
    }

    public 
};