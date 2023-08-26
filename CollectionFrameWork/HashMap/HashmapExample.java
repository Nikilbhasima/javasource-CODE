package CollectionFrameWork.HashMap;

import java.util.HashMap;

public class HashmapExample {
    public void displayHashMap(){
        HashMap<Integer,String> hashmap=new HashMap<Integer, String>();
        hashmap.put(111,"raman");
        hashmap.put(112,"swayan");
        hashmap.put(113,"bikal");
        hashmap.put(114,"sujan");
        System.out.println("after adding to hash map:"+hashmap);
        hashmap.remove(111);
        System.out.println(hashmap);
        hashmap.remove(112,"swayan");
        System.out.println(hashmap);


    }

}
