package oop.superKeyword;

public class NikilChild extends NikilParent{

    public void checkman(){
        System.out.println(super.whatsup);
    }
    public static void main(String[] args){
    NikilChild obj=new NikilChild();
     obj.checkitman();
     obj.checkman();
        System.out.println(obj.whatsup);

    }
}
