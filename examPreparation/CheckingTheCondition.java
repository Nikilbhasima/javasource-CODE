package examPreparation;
//
//	Write a program that inputs three integers from the user and displays the sum, average, product, smallest
  //      and the largest of the numbers
public class CheckingTheCondition {
    public void checking(int a,int b,int c){
        int sum=a+b+c;
        int average=sum/3;
        int product=a*b*c;
        System.out.println("sum of three number is="+sum);
        System.out.println("average of three number is="+average);
        System.out.println("product of three number is="+product);
        System.out.println("to check the greatest one");
        if(sum>average && sum>product){
            System.out.println("the greatest number is sum="+sum);
        }
        else if (average>sum && average>product) {
            System.out.println("the greatest number is average="+average);

        }
        else {
            System.out.println("ther greatest number is product="+product);
        }
        System.out.println("to check the smallest one");
        if (sum<average && sum<product){
            System.out.println("the smallest number is sum="+sum);
        } else if (average<sum && average<product) {
            System.out.println("the smallest number is average="+average);

        }
        else {
            System.out.println("the smallest number is product="+product);
        }
    }
}
