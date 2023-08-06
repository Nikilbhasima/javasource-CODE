package examPreparation;

public class Result extends Test{
    float total;
    public void calculate(){
        total=super.math+super.nepali;

    }
    public void display3(){
        System.out.println("total marks obtained by the student is:"+total);
    }

    public static void main(String[] args){
        Result obj=new Result();
        obj.read();
        obj.read2();
        obj.calculate();
        obj.display();
        obj.display2();
        obj.display3();
    }


}