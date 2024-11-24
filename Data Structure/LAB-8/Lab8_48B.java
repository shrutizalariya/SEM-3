//  Write a program for evaluation of prefix Expression using Stack. 
 
/**
 * Lab8_48B
 */
import java.util.*;

public class Lab8_48B {

    public static int evaluatePrefix(String input){
        Stack<Integer> stack = new Stack<>();

        for (int i = input.length()-1; i >= 0; i--) {
            char ch = input.charAt(i);

        // If the character is a digit, push it to the stack
        if (Character.isDigit(ch)) {
            stack.push(ch-'0');
        }
        else {
            int operand1 = stack.pop();
            int operand2 = stack.pop();
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

        int result = evaluatePrefix(input);
        System.out.println("Evaluation Of Prefix Expression = " + result);
}
}