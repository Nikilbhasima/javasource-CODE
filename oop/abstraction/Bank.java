package oop.abstraction;

public  abstract class Bank {
    public Bank(){
        System.out.println("this is bank constructor");
    }
    public abstract int getRatOfInterest();
    public void display(){
        System.out.println("this is bank dispaly");
    }
    public static void getBank(){
        System.out.println("THIS is  bank");
    }
}
