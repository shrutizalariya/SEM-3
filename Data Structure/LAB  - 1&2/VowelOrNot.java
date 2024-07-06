import java.util.Scanner;
public class VowelOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character:");
        char x = sc.next().charAt(0);
        if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U'){
            System.out.println(x+ " is a vowel");
        }
        else{
            System.out.println(x+ " is a consonant");
        }
    }
}
