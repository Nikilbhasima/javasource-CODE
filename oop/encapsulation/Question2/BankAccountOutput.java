package oop.encapsulation.Question2;

import java.util.Scanner;

public class BankAccountOutput {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        BankAccount obj=new BankAccount();
        System.out.println("enter the amount you want to enter");
        double initialAmount= scanner.nextDouble();
        obj.setdeposit(initialAmount);
        System.out.println("Current balance="+obj.getdeposite());
        System.out.println("Enter the amount you want to withdraw=");
        double amount2= scanner.nextDouble();
        obj.setwithdraw(amount2);
        System.out.println("current balance in your account="+obj.getwithdraw());
    }
}
