package ExceptionExample;

public class ExceptionOutput {
    public static void main(String[] args){
        Exceptioneg obj=new Exceptioneg();
        //obj.arithmeticException();
        try {
            obj.displayAge(21);
        }catch (ArithmeticException e){
            System.out.println(e);
            System.out.println("age is less than 20"+e);
        }
    }
}
