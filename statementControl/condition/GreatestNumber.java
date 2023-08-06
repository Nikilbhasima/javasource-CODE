package statementControl.condition;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER");
        int i=0,j=0,n=0,temp=0;
        System.out.println("enter number of value you want to entered");
        n=scanner.nextInt();
        int[] number=new int[n];
        for(i=0;i<n;i++){
            number[i]= scanner.nextInt();
        }

        for (i=0;i<n;i++){
            for (j=i+1;j<n;j++){
                if(number[i]>number[j]){

                    temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
            }
            for (i=0;i<n;i++){

                System.out.println(number[i]);
            }
        }
    }
}
