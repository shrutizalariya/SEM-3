// Write a program to convert infix notation to postfix notation using stack. 

// import java.sql.Struct;
import java.util.*;
// import java.util.Stack;

/**
 * Lab8_45A
 */
public class Lab8_45A {

    public static int input_precedence(char c){
        if(c=='+' || c=='-'){
            return 1;
        }
        if(c=='*' || c=='/'){
            return 3;
        }
        if(c=='^'){
            return 6;
        }
        if(c=='('){
            return 9;
        }
        if(c==')'){
            return 0;
        }
        else{
            return 7;
        }
    }
    public static int stack_precedence(char c){
        if(c=='+' || c=='-'){
            return 2;
        }
        if(c=='*' || c=='/'){
            return 4;
        }
        if(c=='^'){
            return 5;
        }
        if(c=='('){
            return 0;
        }
        if(c==')'){
            return 0;
        }
        else{
            return 8;
        }
    }
    public static int rank(char c){
        if(c=='+' || c=='-' || c=='*' || c=='/' || c=='^'){
            return -1;
        }
        if(c=='(' || c==')'){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static void main(String[] args) {

    Stack <Character> stack = new Stack <> ();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter input Infix String :");
    String input = sc.next() + ")";
    stack.push('(');
        String polish = " ";
        int ranks = 0;

        for(int i=0 ; i<input.length() ; i++){
            char next = input.charAt(i);
            if(stack.isEmpty()){
                System.out.println("Invalid");
            }
            else{
                while (stack_precedence(stack.peek()) > input_precedence(next)) {
                    char temp = stack.pop();
                    polish = polish + temp;
                    ranks = ranks + rank(temp);
                }
                if(stack_precedence(stack.peek()) != input_precedence(next)){
                    stack.push(next);
                }
                else{
                    stack.pop();
                }
            }
        }
            // if(stack.isEmpty() && ranks == 1){
            //     System.out.println("valid");
            // }
            // else{
            //     System.out.println("Invalid");
            // }
            if(stack.size()!=0 || ranks != 1){
                System.out.println("Valid");
            }
            else{
                System.out.println("Invalid");
            }
        System.out.println("Postfix Expression = " +polish);
    }
}