import java.util.*;

public class SortingName{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a length of array:");
		int n = sc.nextInt();
		String[] str = new String[n];

		for(int i=0;i<n;i++){
			System.out.println("str["+i+"] = ");
			str[i] = sc.next();
		}

		String min =" ";
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n-1;j++){
				for(int k=0;k<str[j].length();k++){
					if(str[i].charAt(k)>str[j].charAt(k)){
						min = str[j];
					}
					else{
						min = str[i];
					}
				}
				System.out.println(min);
			}
		}
	}
}