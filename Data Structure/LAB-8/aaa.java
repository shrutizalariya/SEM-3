import java.util.*;
// import java.util.Stack;
/**
 * Lab8_46B
 */
public class aaa {

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
}
public static void main(String[] args) {

    Stack <Character> stack = new Stack <> ();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter input Infix String :");
    String input = sc.next() + ")";
    StringBuilder input1 = new StringBuilder(input);

    input1.reverse();

    for(int i=0;i<input1.length();i++){
        if(input1.charAt(i) == '('){
            input1.setCharAt(i, ')');
            i++;
        }
        else if(input1.charAt(i) == '('){
            input1.setCharAt(i, '(');
            i++;
        }
    }
    input = input1.toString();
    input += ")";
    stack.push('(');
    String polish = " ";
    char ch;
    for(int i=0 ; i<input.length() ; i++){
         ch = input.charAt(i);
        if(stack.isEmpty()){
            System.out.println("Invalid");
            return;
        }
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            polish += ch;
        }
        else if (ch == '('){
            stack.push(ch);
        }
        else if(ch == ')'){
            while (stack_precedence(ch) < stack_precedence(stack.peek())) {
                polish += stack.pop();
            }
        }
        while (! stack.empty()) {
            polish += stack.pop();
        }
        StringBuilder polish1 = new StringBuilder(polish);
        polish = polish1.reverse().toString();
        System.out.println("Prefix = " + polish);
    }
}