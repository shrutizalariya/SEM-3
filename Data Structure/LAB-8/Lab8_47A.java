//  Write a program for evaluation of postfix Expression using Stack.

/**
 * Lab8_47A
 */
import java.util.*;
public class Lab8_47A {

    public static int evaluatePostfix(String input){
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

        // If the character is a digit, push it to the stack
        if (Character.isDigit(ch)) {
            stack.push(ch-'0');
        }
        else {
            int operand2 = stack.pop();
            int operand1 = stack.pop();
            int result = 0;

            switch (ch) {
                case '+':
                    result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case '*':
                    result = operand1 * operand2;
                    break;
                case '/':
                    result = operand1 / operand2;
                    break;
            }
            stack.push(result);
        }
    }
    return stack.pop();
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Infix String (comma between each caharacter is must !!)");
        String input = sc.next();

        int result = evaluatePostfix(input);
        System.out.println("Evaluation Of Postfix Expression = " + result);
    }
    
    }