package staticPractice;



import java.util.Scanner;

public class AreaOfCircleOutput {
   public static void main(String[] args){
       Scanner scanner=new Scanner(System.in);
       System.out.println("ENTER THE RADIUS OF CIRCLE");
       int radius=scanner.nextInt();
       System.out.println("Area of circle is="+ AreaOfCircle.input(radius));
   }


}
