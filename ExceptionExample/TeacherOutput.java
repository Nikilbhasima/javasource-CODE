package ExceptionExample;

public class TeacherOutput {
    public static void main(String[] args){
        TeacherChecks obj=new TeacherChecks();
        try {
            obj.checking(50);
        }catch (teacher e){
            System.out.println("the student will not be promoted");
            e.printStackTrace();
        }
    }
}
