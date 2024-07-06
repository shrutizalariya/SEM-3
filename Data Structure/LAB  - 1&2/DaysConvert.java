import java.util.Scanner;
public class DaysConvert {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter days:");
        int n = sc.nextInt();

        int y = n/365;
        int w = (n-(y*365))/7;
        int d = (n-((y*365)+(w*7)));

        System.out.println("Answer = "+y+" year "+w+" week "+d+" days");
    }
}