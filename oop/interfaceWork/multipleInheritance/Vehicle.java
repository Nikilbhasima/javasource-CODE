package oop.interfaceWork.multipleInheritance;

public class Vehicle implements Bike,Cycle{
    @Override
    public void speed() {
        System.out.println("bike speed is 80km/hr");
    }

    @Override
    public void run() {
        System.out.println("Bike is running");
    }

    @Override
    public void color() {
        System.out.println("cycle is black");
    }
}
