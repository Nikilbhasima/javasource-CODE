package CollectionFrameWork.arrayList;

import java.util.ArrayList;

public class arrayListForeachLoop {
    public static void main(String[] args){
        ArrayList<Float> numbers=new ArrayList<>();
        numbers.add(2.2f);
        numbers.add(2.22f);
        numbers.add(1.2f);
        numbers.add(9.3f);
        System.out.println(numbers);
        System.out.println("size of array:"+numbers.size());
        for (float num:numbers){
            int i=0;
            System.out.println(num);
        }

        ArrayList<String> name=new ArrayList<>();
        name.add("nikil bhasima");
        name.add("christhamster");
        name.add("hello world");
        System.out.println(name);
        for (String name2:name){
            System.out.println(name2);
        }

    }
}
