package ExceptionExample;

public class Exceptioneg {
    public void arithmeticException() {
        try {
            System.out.println(6 / 9);
            System.out.println(9 / 0);
        }catch (ArithmeticException a){
            System.out.println("number cant be divided by o"+a);
        }finally {
            System.out.println("try try but never cry");
        }


    }

    public void displayAge(int age) throws ArithmeticException{
        if(age<20){
            throw new ArithmeticException("teenage");
        }
        else {
            System.out.println("good to go");
        }
    }
}
