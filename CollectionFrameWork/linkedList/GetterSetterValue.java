package CollectionFrameWork.linkedList;

import java.util.LinkedList;

public class GetterSetterValue {
    public void enter(){
        LinkedList<GetterSetter> linkedList=new LinkedList<>();
        GetterSetter obj=new GetterSetter();
        obj.setId(011);
        obj.setName("nikil");
        linkedList.add(obj);
        System.out.println(linkedList);
//        System.out.println(obj.toString());

    }

}
