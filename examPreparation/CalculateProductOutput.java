package examPreparation;

import java.util.Scanner;

public class CalculateProductOutput {
    public static void main(String[] args){
        CalculateProduct obj=new CalculateProduct();
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter any three number");
        int h= scanner.nextInt();
        int j= scanner.nextInt();
        int k= scanner.nextInt();
        int result=obj.product(h,j,k);
        System.out.println("Product of any three number are="+result);
    }
}
