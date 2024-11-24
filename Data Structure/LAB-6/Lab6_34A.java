// Create class Employee_Detail with attributes Employee_ID, Name, Designation, 
// and Salary. Write a program to read the detail from user and print it. 

import java.util.*;

class Employee_Detail{
    int Employee_ID;
    String Name;
    String Designation;
    float Salary;

    void setDetail(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee_ID: ");
        Employee_ID = sc.nextInt();

        System.out.println("Enter Name: ");
        Name = sc.next();

        System.out.println("Enter Designation: ");
        Designation = sc.next();

        System.out.println("Enter Salary: ");
        Salary = sc.nextFloat();
    }
    void getDetail(){
        System.out.println(Employee_ID);
        System.out.println(Name);
        System.out.println(Designation);
        System.out.println(Salary);
    }
}
public class Lab6_34A {
    public static void main(String[] args) {
        Employee_Detail E = new Employee_Detail();
        E.setDetail();
        E.getDetail();
    }
}