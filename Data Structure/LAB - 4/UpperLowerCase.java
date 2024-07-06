import java.util.*;
public class UpperLowerCase{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = sc.nextLine();
        System.out.println("Final String:");
        String str = " ";
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='a' && c<='z'){
                c=(char)(c-32);
            }
            else if(c>='A' && c<='Z'){
                c=(char)(c+32);
            }
            str=str+c;  
        }
         System.out.println(str);
    }
}