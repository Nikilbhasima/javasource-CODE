package examPreparation;

import java.util.Scanner;
//
//3.	Write a program that inputs three integers from the user and displays the sum, average, product, smallest
 //       and the largest of the numbers
public class CheckingTheConditionOutput {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        CheckingTheCondition obj=new CheckingTheCondition();
        System.out.println("ENTER THE FIRST NUMBER");
        int f= scanner.nextInt();;
        System.out.println("ENTER THE SECOND NUMBER");
        int s= scanner.nextInt();;
        System.out.println("ENTER THE THIRD NUMBER");
        int t= scanner.nextInt();
       obj.checking(f,s,t);
    }
}
