package examPreparation;

import staticPractice.StaticOutput;

import java.util.Scanner;

public class BasicCalculatorOutput {
    public static void main(String[] args){
        int choice,num1,num2;
        Scanner scanner=new Scanner(System.in);
        BasicCalculator obj=new BasicCalculator();
        System.out.println("enter any two number");
        num1= scanner.nextInt();
        num2= scanner.nextByte();
        System.out.println("which task do you want to perform\n1.addition\n2.subtraction\n3.multiplication\n4.division");
        choice= scanner.nextInt();
        switch (choice){
            case 1:
                obj.add(num1,num2);
                break;
            case 2:
                obj.diff(num1,num2);
                break;
            case 3:
                obj.mul(num1,num2);
                break;
            case 4:
                obj.div(num1,num2);
                break;
        }
    }
}
