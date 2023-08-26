package CollectionFrameWork.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class New {
    public void new1(){
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> arraylist=new ArrayList<>();
        System.out.println("enter the number of element");
        int n= scanner.nextInt();
        for (int i=0;i<n;i++){
            int number=scanner.nextInt();
            arraylist.add(number);

        }

        System.out.println(arraylist);

    }
}
