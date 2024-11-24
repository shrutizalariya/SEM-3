// Create array of object of class Student_Detail with attributes Enrollment_No, 
// Name, Semester, CPI for 5 students, scan their information and print it.

import java.util.*;

class Student_Detail{
    int Enrollment_No;
    String Name;
    int Semester;
    float CPI;

void setDetail(){
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter Enrollment_No: ");
    Enrollment_No = sc.nextInt();

    System.out.println("Enter Name: ");
    Name = sc.next();

    System.out.println("Enter Semester: ");
    Semester = sc.nextInt();

    System.out.println("Enter CPI: ");
    CPI = sc.nextFloat();
}
void getDetail(){
    System.out.println(Enrollment_No);
    System.out.println(Name);
    System.out.println(Semester);
    System.out.println(CPI);
}
}
public class Lab6_35A {

    public static void main(String[] args) {
        Student_Detail[] Student = new Student_Detail[5];

        for(int i=0;i<5;i++){
            Student[i] = new Student_Detail();
        }
        for(int i=0;i<5;i++){
            Student[i].setDetail();
        }
        for(int i=0;i<5;i++){
            Student[i].getDetail();
        }
    }
}