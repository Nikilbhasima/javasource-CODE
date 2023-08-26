package CollectionFrameWork.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public void displayHashSet(){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("ram");
        hashSet.add("shyam");
        hashSet.add("Hari");
        hashSet.add(null);
        hashSet.add(null);
        System.out.println("After Hashset"+hashSet);

        hashSet.remove("ram");
        hashSet.add("C#");
        System.out.println("after hasset"+ hashSet);
    }
}
