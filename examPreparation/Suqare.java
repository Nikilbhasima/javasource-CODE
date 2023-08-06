package examPreparation;

import java.util.Scanner;

public class Suqare implements Area{
    int length;
  Scanner scanner=new Scanner(System.in);
    @Override
    public void getdata() {
        System.out.println("Enter the length of square");
        length= scanner.nextInt();
    }

    @Override
    public void displayArea() {
        System.out.println("are of square is:"+length*length);
    }
}
