package CollectionFrameWork.arrayList;

import java.util.ArrayList;

public class BikalSet {
    public void bikalSeta(){
        ArrayList<BikalInfo> arrayList=new ArrayList<>();
        BikalInfo obj=new BikalInfo();
        BikalInfo obj1=new BikalInfo();
        obj.setAddress("lalitput");
        obj.setAge(35);
        obj.setName("bikal");
        obj1.setName("Nikil");
        obj1.setAddress("madhyapur thimi");
        obj1.setAge(20);
        arrayList.add(obj);
        arrayList.add(obj1);
//        System.out.println(obj.toString());
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.remove(1));
        System.out.println(arrayList);
        System.out.println(arrayList.set(1,obj1));
        System.out.println(arrayList);
    }
}
