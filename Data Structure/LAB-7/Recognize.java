import java.util.*;
class Stack {
    private char[] stackArray;
    private int top;
    private int m;

    public Stack(int m) {
        this.m = m;
        stackArray = new char[m];
        top = -1;
    }

    public void push(char c) {
        stackArray[++top] = c;
    }

    public char pop() {
        return stackArray[top--];
    }
}

public class Recognize {
    public static boolean recognize(String str) {
       
        int halfLength =str.length() / 2;

        Stack s = new Stack(str.length());
    
        for (int i = 0; str.charAt(i)!='c'; i++) {
            s.push(str.charAt(i));
        }

        int start = (str.length() % 2 == 0) ? halfLength : halfLength + 1;
        for (int i = start; i < str.length(); i++) {
            if (str.charAt(i) != s.pop()) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter input string");
            String str = sc.next();
            boolean isCorrect = recognize(str);
            System.out.println(str + " is grammatically correct? " + isCorrect);
    }
}
