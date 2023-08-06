package examPreparation.Question5;

import java.util.Scanner;

public class Student {
    int rollNumber;
    Scanner scanner=new Scanner(System.in);
    public void read1(){
        System.out.println("enter the roll number");
        rollNumber=scanner.nextInt();
    }
    public void display1(){
        System.out.println("roll number of student is:"+rollNumber);
    }
}
