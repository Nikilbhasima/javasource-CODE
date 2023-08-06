package Exception;

public class Practice2 {
    public static void main(String[] args){
        try {
            System.out.println(3/4);
            System.out.println(8/3);
            System.out.println(6/3);
            System.out.println(5/0);
        }catch (Exception e){
            System.out.println("number cant be divisible by 0");
        }finally {
            System.out.println("remove the line or correct the condition");
        }
    }
}
