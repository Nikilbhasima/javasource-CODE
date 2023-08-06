package oop.abstraction;

public class HimalayanOutput {
    public static void main(String[] args){
        HimalayanBank bank=new HimalayanBank();
        System.out.println("rate of interest="+bank.getRatOfInterest());//abstract method
        bank.display();//non abstract
        HimalayanBank.getBank();

    }
}
