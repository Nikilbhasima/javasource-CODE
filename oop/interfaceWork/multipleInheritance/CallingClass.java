package oop.interfaceWork.multipleInheritance;

public class CallingClass implements A,B{
    @Override
    public void H() {
        System.out.println("hello man");
    }

    @Override
    public void J() {
        System.out.println("bye man");
    }
}
