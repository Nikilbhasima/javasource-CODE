package examPreparation.Question4;

public class NumChild implements Num{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int diff(int a, int b) {
        return a-b;
    }
    public static void main(String[] args){
        NumChild obj=new NumChild();
        System.out.println("sum of two number is:"+obj.add(4,5));
        System.out.println("difference of two number is:"+obj.diff(5,3));
    }
}
