package examPreparation.Question5;

import java.util.Scanner;

public class Result extends Test{
        Scanner scanner=new Scanner(System.in);
    int total;
    public void read3(){
        total=super.marks1+super.marks2;
    }


    public void display3() {
        System.out.println("total marks of student is:"+total);
    }

    public static void main(String[] args){
        Result obj=new Result();
        obj.read1();
        obj.read2();
        obj.read3();
        obj.display1();
        obj.display2();
        obj.display3();
    }
}
