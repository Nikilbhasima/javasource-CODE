package oop.encapsulation;

public class StudentOutput {
    public static void main(String[] args){
        Student obj=new Student();
        obj.setid(12);
        obj.setName("sujal shakya");
        System.out.println("student id is="+obj.getid());
        System.out.println("student name is="+obj.getName());
       // int[] name=new int[10];
        //int number[]=new int[10];
    }
}
