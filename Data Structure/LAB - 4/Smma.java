import java.util.*;
public class Smma{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a length of array:");
		int n = sc.nextInt();
		int arr[] = new int[n];

		for(int i=0;i<n;i++){
			System.out.println("arr["+i+"] = ");
			arr[i] = sc.nextInt();
		}

		int max = arr[0];
		int sum = 0;
		double avg = 0;
		int min = arr[0];

		for(int i=0;i<n;i++){
			sum = sum + arr[i];
			if(arr[i]<min){
				min=arr[i];
			}
			if(arr[i]>max){
				max=arr[i];
			}
		}

		avg = sum/(double)(n);

		System.out.println("1.sum = "+sum);
		System.out.println("2.minimum num = "+min);
		System.out.println("3.maximum num = "+max);
		System.out.println("4.average = "+avg);
	}
}