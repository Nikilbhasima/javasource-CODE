package oop.encapsulation.Question3;

import java.util.Scanner;

public class StudentOutput {
    public static void main(String[] args){
        Student obj=new Student();
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the id character of 8 combination");
        String id=scanner.nextLine();
        obj.setid(id);
        System.out.println("enter the name of the studnet");
        String name= scanner.nextLine();
        obj.setName(name);
        System.out.println("name of student="+obj.getName());
        System.out.println("id of student is="+obj.getid());
    }
}
