// Create methods to convert temperature from Celsius to Fahrenhit and vice 
// versa. Take temperature input from user and call the appropriate conversion method.

import java.util.*;

/**
 * Lab6_36B
 */
public class Lab6_36B {

    public static void Celsius(double t){
        double Cel = (t-32)*5/9;
        System.out.println("Celsius = "+Cel);
    }
    public static void Fahrenhit(double t){
        double Fah = t*(9/5)+32;
        System.out.println("Fahrenhit = "+Fah);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter C for change into Celsius F for change into Fahrenhit:");
        String S = sc.nextLine();

        System.out.println("Enter Temperature : ");
        double t = sc.nextDouble();

        if(S.equals("C")){
            Celsius(t);
        }
        else if(S.equals("F")){
            Fahrenhit(t);
        }
    }
}