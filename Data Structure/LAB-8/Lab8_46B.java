import java.util.*;

public class Lab8_46B{

    public static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input Infix String:");
        String input = sc.next();
        sc.close();

        // Reverse the input string
        StringBuilder input1 = new StringBuilder(input);
        input1.reverse();
        input = input1.toString();

        // Replace '(' with ')' and vice versa
        input = input.replace('(', 't');
        input = input.replace(')', '(');
        input = input.replace('t', ')');

        // Initialize the stack with a bottom sentinel
        stack.push('(');
        StringBuilder polish = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                polish.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    polish.append(stack.pop());
                }
                if (!stack.isEmpty()) {
                    stack.pop(); // Pop '('
                }
            } else { // Operator
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    polish.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        // Pop remaining operators from the stack
        while (!stack.isEmpty() && stack.peek() != '(') {
            polish.append(stack.pop());
        }

        // Reverse the result to get the prefix notation
        String result = polish.reverse().toString();
        System.out.println("Prefix = " + result);
    }
}