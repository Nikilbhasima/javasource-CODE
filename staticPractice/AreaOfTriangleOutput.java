package staticPractice;

import java.util.Scanner;

public class AreaOfTriangleOutput {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("enter the height of triangle");
        int length= scanner.nextInt();
        System.out.println("enter the height of base");
        int breadth= scanner.nextInt();
        System.out.println("area of triangle="+AreaOfTriangle.triangle(length,breadth));

    }
}
