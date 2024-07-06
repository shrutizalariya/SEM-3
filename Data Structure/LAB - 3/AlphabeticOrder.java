import java.util.*;
public class AlphabeticOrder{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a length of array:");
		int n = sc.nextInt();

		String arr[] = new String[n];

		for(int i=0;i<n;i++){
			System.out.println("arr["+i+"] = ");
			arr[i] = sc.next();
		}

		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));
	}
}