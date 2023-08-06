package examPreparation;
//Write an application that asks the user to enter two integers, obtains them from the user and displays the larger
//	number followed by the words “is larger”. If the numbers are equal, print “These numbers are equal”.
public class GreatestCalculation {
    public void check(int a,int b){
        if (a==b){
            System.out.println("both value are equal");
        } else if (a>b) {
            System.out.println("greateset number is a="+a);

        }
        else {
            System.out.println("greatest number is b="+b);
        }
    }
}
