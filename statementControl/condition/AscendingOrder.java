package statementControl.condition;

import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int temp,i,j,n;

        System.out.println("Enter the number of value you want to ask");
        n=scanner.nextInt();
        int[] number=new int[n];
        for (i=0;i<n;i++){
            number[i]=scanner.nextInt();
        }
        System.out.println("Ascending order");

        for (i=0;i<n;i++){
            for (j=i+1;j<n;j++){
                if (number[i]>number[j]){
                    temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
            }
        }
        for (i=0;i<n;i++){
            System.out.println(number[i]);
        }
    }
}
