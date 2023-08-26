package CollectionFrameWork.linkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args){
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println(linkedList);
        linkedList.add(2,10);
        System.out.println(linkedList);
        System.out.println(linkedList.get(4));
        System.out.println(linkedList.size());
        linkedList.set(2,20);
        System.out.println(linkedList);
    }
}
