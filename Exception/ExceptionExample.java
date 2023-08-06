package Exception;

public class ExceptionExample {
    public static void main(String[] args){
        try{
            int a=1;
            int b=0;

            System.out.println(a);
            System.out.println(b);
            int c=a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("error:");
        }finally {
            System.out.println("there is an arthmetic error");
        }
    }
}
