package CollectionFrameWork.arrayList;

import java.util.ArrayList;

public class SelfInfirmationSet {
    public void setInformation(){
        ArrayList<SelfInformation> arrayList=new ArrayList<>();
        SelfInformation obj=new SelfInformation();
        obj.setName("nikil bhasima");
        obj.setAddress("Madhyapur Thimi");
        obj.setAge(20);
        obj.setPhone_no(12345);
        arrayList.add(obj);
        System.out.println(arrayList);
        System.out.println("my information is:"+obj.toString());

    }
}
