package ExceptionExample;

public class ChildOutput {
    public static void main(String[] args){
        Operation obj=new Operation();
        try {
            obj.operation(10);
        }catch (Child e){
            System.out.println(e);
            e.printStackTrace();
        }

    }
}
