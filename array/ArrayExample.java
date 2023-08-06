package array;

public class ArrayExample {
    public void displayArray(){
        int number[]=new int[10];
        number[0]=9;
        number[1]=90;
        number[2]=92;
        number[3]=19;
        int sum=0;
        for (int i=0;i< number.length;i++){
            System.out.println(number[i]);
           sum=sum+number[i];
        }
        System.out.println("sum of above numberS ARE ="+sum);

    }
}
