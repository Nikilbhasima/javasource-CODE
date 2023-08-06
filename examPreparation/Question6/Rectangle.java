package examPreparation.Question6;

import java.util.Scanner;

public class Rectangle implements AreaCalculation{
    Scanner scanner=new Scanner(System.in);
    int length;
    int breath;
    @Override
    public void getdata() {
        System.out.println("Enter the length of rectangle");
        length= scanner.nextInt();
        System.out.println("Enter the breadth of rectangle");
        breath= scanner.nextByte();

    }

    @Override
    public void displayArea() {
        System.out.println("area of rectangle is:"+length*breath);

    }
}
