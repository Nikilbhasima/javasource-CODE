package ExceptionExample;

public class Test {
    public void test(int marks) throws Exam{
        if(marks<40){
            throw new Exam("fail");
        }
        else {
            System.out.println("the student is pass");
        }
    }
}
