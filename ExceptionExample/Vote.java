package ExceptionExample;

public class Vote {
    public void eligibilityToVote(int age) throws invalidAgeException{
        if (age<17){
            throw new invalidAgeException("not eligible");
        }
        else {
            System.out.println("he can vote");
        }
    }
}
