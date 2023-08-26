package CollectionFrameWork.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AskingValue {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> name=new ArrayList<>();
        for (int i=0;i<5;i++){
            String name3=scanner.nextLine();
            name.add(name3);
        }
        for (String name2:name) {
            System.out.println(name2);
        }
    }
}
