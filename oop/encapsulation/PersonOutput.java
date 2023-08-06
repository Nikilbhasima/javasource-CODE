package oop.encapsulation;

public class PersonOutput {
    public static void main(String[] args){
        Person obj=new Person();
        obj.setAge(19);
        obj.setName("nikil bhasima");
        obj.setmarried(true);
        System.out.println("name="+obj.getName());
        System.out.println("age="+obj.getAge());
        System.out.println("boolean="+obj.getmarried());
    }
}
