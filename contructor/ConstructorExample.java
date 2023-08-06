package contructor;

public class ConstructorExample {
    int a=10;
    int b=15;
    public ConstructorExample(int a,int b){
        int area;
        area=a*b;
        System.out.println("area of rectangle from passed value="+area);
        System.out.println("area of rectangel from this="+this.a*this.b);

    }
}
