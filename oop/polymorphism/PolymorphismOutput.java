package oop.polymorphism;

public class PolymorphismOutput {
    public static void main(String[] args){
        PolymorphismExample obj=new PolymorphismExample();
      int sum1=  obj.A(6,6);
       int sum2= obj.A(2,5,9);
        System.out.println("caliing the two parameter method="+sum1);
        System.out.println("calling the three parameter methos="+sum2);

    }
}
