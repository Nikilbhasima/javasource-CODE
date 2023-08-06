package ExceptionExample;

public class VoteOutput {
    public static void main(String[] args){
        Vote obj=new Vote();
        try {
            obj.eligibilityToVote(10);
        }catch (invalidAgeException e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
