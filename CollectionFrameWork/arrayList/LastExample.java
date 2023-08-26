package CollectionFrameWork.arrayList;

import java.util.ArrayList;

public class LastExample {
    public static void main(String[] args){
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("nikil");
        arrayList.add("sahan");
        arrayList.add("saurav");
        arrayList.add("sujal");
        arrayList.add("ricky");
        System.out.println(arrayList);
        System.out.println(arrayList.get(3));
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.size());
        arrayList.remove(1);
        arrayList.set(1,"sameer");
        arrayList.set(3,"sameer2");
        arrayList.add(2,"suman");

        System.out.println(arrayList);
        arrayList.add(5,"rohit");
        System.out.println(arrayList);


    }
}
