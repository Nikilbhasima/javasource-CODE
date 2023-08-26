package CollectionFrameWork.arrayList;

import java.util.ArrayList;

public class EmployeeInput {
    public void employeeInput(){
        ArrayList<Employee> employees=new ArrayList<>();
        Employee obj=new Employee();
        Employee obj2=new Employee();
        obj.setName("nikil");
        obj.setId(1);
        obj.setAddress("Madhyapur");
        obj.setPhone_number(98080299);
        obj2.setAddress("thimi");
        obj2.setName("sujal");
        obj2.setId(02);
        obj2.setPhone_number(8343943);
        employees.add(obj);
        employees.add(obj2);
        System.out.println("employee information:"+employees.toString());
    }
}
