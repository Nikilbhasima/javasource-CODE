package oop.interfaceWork;

public class Tata implements Car{
    @Override
    public void speed() {
        System.out.println("speed of car is 50km/hr");
    }

    @Override
    public void milage() {
        System.out.println("my car give milage 10km");
    }
}
