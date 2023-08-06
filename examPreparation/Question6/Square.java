package examPreparation.Question6;

import java.util.Scanner;

public class Square implements AreaCalculation{
    int length;
Scanner scanner=new Scanner(System.in);
    @Override
    public void getdata() {
        System.out.println("Enter the length of rectangle");
        length= scanner.nextInt();
    }

    @Override
    public void displayArea() {
        System.out.println("area of rectangle is:"+length*length);
    }
}
