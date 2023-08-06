package examPreparation.Question5;

import java.util.Scanner;

public class Test extends Student{
    int marks1;
    int marks2;
    public void read2(){
        //Scanner scanner=new Scanner(System.in);
        System.out.println("enter the marks of two subject");
        marks1=scanner.nextInt();
        marks2=scanner.nextInt();
    }
    public void display2(){
        System.out.println("marks of subject 1:"+marks1);
        System.out.println("marks of subject 2:"+marks2);

    }
}
