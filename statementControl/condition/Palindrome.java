package statementControl.condition;

import java.util.Scanner;

public class Palindrome {
    public void test1(){
        Scanner scanner=new Scanner(System.in);
        int temp,n,rem,rev=0;
        System.out.println("enter any positive number");
        n=scanner.nextInt();
        temp=n;
        while (n!=0){
            rem=temp%10;
            rev=rem+rev*10;
            temp=temp/10;
        }
        if (n==rev)
            System.out.println("the given number is palindrome="+n);
        else
            System.out.println("the number is not palindrome="+n);
    }
}
