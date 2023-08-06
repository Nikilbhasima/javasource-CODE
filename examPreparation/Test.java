package examPreparation;

import java.util.Scanner;

public class Test extends Student{
    float math;
    float nepali;
    Scanner scanner=new Scanner(System.in);
    public void read2(){

        System.out.println("enter the marks in math");
        math=scanner.nextFloat();
        System.out.println("Enter the marks in nepali");
        nepali= scanner.nextFloat();
    }
    public void display2(){
        System.out.println("marks obtained in math is:"+math);
        System.out.println("marks obtainded in nepali is:"+nepali);
    }

}
