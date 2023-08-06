package oop.superKeyword;

public class B  extends A{

    String name="nivesh";
    public void run(){
        super.display();
        System.out.println(super.name);
        System.out.println(this);
    }
}
