package examPreparation.Question7;

import java.util.Scanner;

public class Airplane extends Fmachine{
Scanner scanner=new Scanner(System.in);
    int code;
    String name_capacity;
    @Override
    public void getData() {
        System.out.println("ente the code");
        code=scanner.nextInt();
scanner.nextLine();
        System.out.println("enter the name_capacity");
        name_capacity= scanner.nextLine();
    }

    @Override
    public void display() {
        System.out.println("code is:"+code);
        System.out.println("name capacity is:"+name_capacity);

    }
    public static void main(String[] args){
        Airplane obj=new Airplane();
        obj.getData();
        obj.display();
    }
}
