package ExceptionExample;

import java.util.Scanner;

public class Result {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the marks in exam");
        int marks=scanner.nextInt();
        Test obj=new Test();
        try {
            obj.test(marks);
        }catch (Exam e){
            System.out.println("the student will not be upgraded");
            e.printStackTrace();
        }
    }
}
