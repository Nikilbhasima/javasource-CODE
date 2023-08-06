package examPreparation;

import java.util.Scanner;

public class Airplane extends LetOutput{
    int code=001;
    String name_capacity="Nikil_Bhasima";
Scanner scanner=new Scanner(System.in);
    public float getCode(float a) {
        System.out.println("enter the marks in 3 subject");
        System.out.print("java:");
        int makrs1=scanner.nextInt();
        System.out.print("literature:");
        int makrs2=scanner.nextInt();
        System.out.print("Database:");
        int makrs3=scanner.nextInt();
        float result=(makrs1+makrs2+makrs3)/3;
        return result;
    }
    public void putdata( float a){
        float final_result=getCode( a);
        if (final_result<40)
            System.out.println("the student is fail");
        else
            System.out.println("the student is pass with makes:"+final_result);
        //System.out.println(final_result);
    }

}
