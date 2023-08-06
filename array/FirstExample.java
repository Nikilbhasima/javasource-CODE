package array;

import java.util.Scanner;

public class FirstExample {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int[] number=new int[10];
        System.out.println("enter any 10 random number");
        for (int j=0;j<10;j++){
            number[j]= scanner.nextInt();
        }
        System.out.println("random nmber are");
        for(int j=0;j<10;j++){
            System.out.println(number[j]);
            int number2[]={1,2,3,4,5};
                    for(int f=0;f<5;f++){
                        System.out.println(number2[f]);
                    }
        }
    }
}
