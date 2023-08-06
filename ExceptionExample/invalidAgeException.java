package ExceptionExample;

public class invalidAgeException extends Exception{
    public invalidAgeException(String message){
        super(message);//it calls parent(in this case parent class is exception class) class constructor.
    }
}
