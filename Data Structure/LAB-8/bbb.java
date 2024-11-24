import java.util.Stack;

public class bbb {
    
    // Method to evaluate postfix expression
    public static int evaluatePostfix(String expression) {
        // Create a stack
        Stack<Integer> stack = new Stack<>();

        // Iterate over each character in the expression
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            // If the character is a digit, push it to the stack
            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            }
            // If the character is an operator, pop two elements from the stack,
            // perform the operation and push the result back to the stack
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

        // The final result will be the only element left in the stack
        return stack.pop();
    }

    public static void main(String[] args) {
        String postfixExpression = "231*+9-";
        int result = evaluatePostfix(postfixExpression);
        System.out.println("The result of the postfix expression is: " + result);
    }
}