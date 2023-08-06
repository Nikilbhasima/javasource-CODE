package statementControl.condition;

import java.util.Scanner;

public class Armstrong {
    public void test()

    {
        Scanner scanner = new Scanner(System.in);
int arm=0;
        System.out.println("enter any positive number");
        int n = scanner.nextInt();
        int temp = n;
        while (temp != 0) {
            int rem=temp%10;
             arm=rem*rem*rem+arm;
             temp=temp/10;

        }

        if (arm==n){
            System.out.println("the number is armstrong="+n);
        }
        else
            System.out.println("the given number is not armstrong="+n);
    }
}
