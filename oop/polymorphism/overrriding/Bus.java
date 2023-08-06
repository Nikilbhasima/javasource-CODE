package oop.polymorphism.overrriding;

public class Bus {
    public void bikal(){
        System.out.println("i am feeling hot");
    }
//    this.bikal();
    public static void main(String[] args){
        Car obj=new Car();
        obj.car();
        Bus obj2=new Bus();
        obj2.bikal();

    }
}
