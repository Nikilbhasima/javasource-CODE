package ExceptionExample;

public class TeacherChecks {
    public void checking(int marks) throws teacher{
        if (marks<40){
            throw new teacher("the student is fail");
        }
        else
            System.out.println("the student is pass");
    }
}
