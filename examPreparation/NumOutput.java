package examPreparation;

public class NumOutput implements Num {
    @Override
    public int add(int x, int y) {

        return x+y;
    }

    @Override
    public int diff(int x, int y) {
        return x-y;
    }

    public static void main(String[] args){
        NumOutput obj=new NumOutput();
        System.out.println("sum of two number is:"+obj.add(5,5));
        System.out.println("difference of two number is:"+obj.diff(6,8));
    }
}
