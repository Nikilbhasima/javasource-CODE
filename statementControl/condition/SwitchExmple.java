package statementControl.condition;

public class SwitchExmple {
    public static void main(String[] args){
        int choice=3;
        switch (choice){
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("bye");
                break;
            case 3:
                System.out.println("no man");
                break;
            default:
                System.out.println("enter valid number");
        }
    }
}
