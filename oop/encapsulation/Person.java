package oop.encapsulation;
//Create a class called "Person" with private attributes: name (String), age (int), and isMarried (boolean).
// Implement public getter and setter methods for each attribute.
// Ensure that the age is always non-negative and the name is not empty.
public class Person {
    private int age;
    private String name;
    private boolean married;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }

    public void setmarried( boolean married){
        this.married=married;
    }
    public boolean getmarried(){
        return this.married;
    }

}
