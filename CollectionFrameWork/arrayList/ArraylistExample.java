package CollectionFrameWork.arrayList;

import staticPractice.StaticOutput;

import java.util.ArrayList;

public class ArraylistExample {
    public void display(){
        ArrayList<String> list=new ArrayList<String>();
        list.add("virinchi");
        list.add("NCCS");
        System.out.println(list);
        int size=list.size();
        System.out.println("size of arraylist="+size);
//        list.remove(1);
//        System.out.println(list);
        for (String name:list){
        System.out.println(name);
    }
        for (int i=0;i<2;i++){
            System.out.println(list.get(i));
        }
    }
}
