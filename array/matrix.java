package array;

import java.util.Scanner;

public class matrix {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number of row of matrix");
        int r= scanner.nextInt();
        scanner.nextLine();
        System.out.println("enter the colums of the matrix");
        int c= scanner.nextInt();
        System.out.println("enter the values of matrix");
        int[][] m=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;i<c;j++){
                m[i][j]=scanner.nextInt();
            }
        }
        System.out.println("matrix youhave enterd is");
        for (int i=0;i<r;i++){
            for (int j=0;i<c;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
}
