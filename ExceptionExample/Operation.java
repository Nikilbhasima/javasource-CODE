package ExceptionExample;

public class Operation {
    public void operation(int age) throws Child{
        if (age<17){
            throw new Child("the child is not suitable for operation");
        }
        else{
            System.out.println("the child is suitable for operation");
        }
    }
}
