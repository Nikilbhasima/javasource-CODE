package examPreparation.Question3;

public class RectangleOUtput {
    public static void main(String[] args){
        Rectangle2 obj=new Rectangle2();
        Rectangle2 obj2=new Rectangle2();
        obj.computerArea(4,3);
        int result=obj.displayArea();
        obj2.computerArea(6,7);
        int result2=obj2.displayArea();
        if (result>result2){
            System.out.println("obj1  has greater area than obj2");
        }
        else
            System.out.println("obj2 has greater area than obj1");
    }
}
