package examPreparation;

import java.util.Scanner;

public class Student {
    int roll_number;
    Scanner scanner=new Scanner(System.in);
    public void read(){
        System.out.println("Enter the roll number");
        roll_number=scanner.nextInt();
    }
    public void display(){
        System.out.println("roll number of student is:"+roll_number);
    }
}
