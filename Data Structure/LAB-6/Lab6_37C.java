// Create a class BankAccount with attributes like account number, balance, 
// account holder and name. Create an array of BankAccount objects to store 
// bank accounts. Implement methods to deposit money, withdraw money and 
// check balance.

import java.util.*;

class BankAccount{
    int accountNo;
    double balance;
    String accholder;
    String Name;

    Scanner sc=new Scanner(System.in);
    public BankAccount(){
        System.out.println("Enter AccountNo : ");
        accountNo=sc.nextInt();

        System.out.println("Enter Balance : ");
        balance=sc.nextDouble();

        System.out.println("Enter accholder : ");
        accholder=sc.next();

        System.out.println("Enter Name : ");
        Name = sc.next();
    }

    void deposit(){
        System.out.println("Enter Deposit Money : ");
        double dm=sc.nextDouble();

        balance=balance+dm;
        System.out.println(balance);
    }
    void withdraw(){
        System.out.println("Enter withdraw Money : ");
        double wm=sc.nextDouble();

        if(wm>0){
            balance=balance-wm;
        }
        else if(wm<0){
            System.out.println("Please check balance");
        }
        else{
            System.out.println("Not enough balance");
        }
        System.out.println(balance);
    }
    void displayBalance(){
        System.out.println(balance);
    }
}
/**
 * Lab6_37C
 */
public class Lab6_37C {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number : ");
        int n=sc.nextInt();

        BankAccount[] b=new BankAccount[n];

        for(int i=0;i<n;i++){
            b[i]=new BankAccount();
            b[i].displayBalance();
            b[i].deposit();
            b[i].withdraw();
            b[i].displayBalance();
        }
    }
}