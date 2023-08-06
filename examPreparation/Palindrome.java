package examPreparation;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter any number");
        int num=scanner.nextInt();
        int temp=num;
        int rem=0;
        int rev=0;
        while (temp!=0){
            rem=temp%10;
            rev=rev *10+rem;
            temp=temp/10;
        }
        if (num==rev)
            System.out.println("given number is palindrome:"+num);
        else
            System.out.println("given number is not is palindrome:"+num);
    }
}
