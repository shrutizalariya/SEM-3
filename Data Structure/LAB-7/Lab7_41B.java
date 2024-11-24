import java.util.*;

public class Lab7_41B {
    public static boolean isBalanced(String){
        Stack<Character> stack = new Stack<>();
        char [] c = s.tocharArray();

        for(int i=0;i<c.length;i++){
            if(c[i]=='c'){
                stack.push(')');
            }
            else if (c[i]=='{') {
                stack.push('}');
            }
            else if (c[i]=='[') {
                stack.push(']');
            }
            else if(stack isEmpty() || stack.pop()!=c[i]){
                return false;
            }
        }
        //return stack isEmpty();
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of test cases : ");
        int T = sc.nextInt();
        int i=0;

        while (i<T) {
            String s=sc.next();
            System.out.println(isBalanced(s)?1:0);
            i++;
        }
    }
}
