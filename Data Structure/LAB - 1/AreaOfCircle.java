import java.util.Scanner;
    public class AreaOfCircle {
    
        public static void main(String []args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter radius:");
            int r = sc.nextInt();
            double A = Math.PI*r*r;
            System.out.println("Area of circle is = "+A);
        }
    }
