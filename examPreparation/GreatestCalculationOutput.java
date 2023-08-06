package examPreparation;

import java.util.Scanner;

public class GreatestCalculationOutput {
    public static void main(String[] args){
        GreatestCalculation obj=new GreatestCalculation();
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER first number");
        int f= scanner.nextInt();
        System.out.println("enTER second number");
        int s=scanner.nextInt();
        obj.check(f,s);
    }
}
