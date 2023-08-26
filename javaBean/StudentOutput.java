package javaBean;

import CollectionFrameWork.arrayList.Student;

public class StudentOutput {
    public static void main(String[] args) {
        Student obj=new Student();
        obj.setId(111);
        obj.setName("java");
        System.out.println(obj.getId()+" "+obj.getName() );
    }
}
