package oop.polymorphism;

import staticPractice.StaticOutput;

import java.util.Scanner;

public class CalculateOutput {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        CalculateExample obj=new CalculateExample();
        System.out.println("to add two number enter '1' for adding three number enter '2'");
        int option=scanner.nextInt();
        if(option==1){
            int h,j;
            System.out.println("enter any two number");
            h=scanner.nextInt();
            j= scanner.nextInt();
            int result=obj.A(h,j);
            System.out.println("sum of two number is="+result);
        }
        else if (option==2) {
            int h,j,m;
            System.out.println("enter any three number");
            h=scanner.nextInt();
            j= scanner.nextInt();
            m=scanner.nextInt();
           int result= obj.A(h,j,m);
            System.out.println("sum of three number="+result);

        }
        else {
            System.out.println("invalid option");
        }


    }
}
