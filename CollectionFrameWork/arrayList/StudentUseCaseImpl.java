package CollectionFrameWork.arrayList;

import java.util.ArrayList;

public class StudentUseCaseImpl {
    public void displayStudentInfo(){
        ArrayList<Student> arrayList = new ArrayList<>();
        Student student = new Student();
        student.setId(111);
        student.setName("ram");
        Student student1 = new Student();
        student1.setId(123);
        student1.setName("sita");
        arrayList.add(student);
        arrayList.add(student1);
        System.out.println(arrayList.toString()+"\n");

    }
}
