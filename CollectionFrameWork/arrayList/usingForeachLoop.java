package CollectionFrameWork.arrayList;

import java.util.ArrayList;

public class usingForeachLoop {
    public static void main(String[] args){
        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i=0;i<10;i++){
            numbers.add(i+1);
        }
        System.out.println(numbers);
        numbers.remove(8);
        System.out.println(numbers);
        System.out.println(numbers.get(8));
        //System.out.println(numbers.get(9));
      //  System.out.println(numbers.get(10));
        for (int i=0;i<10;i++){
            System.out.print(numbers.get(i));
        }
        System.out.println();

    }
}
