package examPreparation;

public class Rectangle implements Area{
    int length;
    int breadth;

    @Override
    public void getdata() {
        System.out.println("Enter the length of rectangle");
        length= scanner.nextInt();
        System.out.println("Enter the breadth of rectangle");
        breadth= scanner.nextByte();
    }

    @Override
    public void displayArea() {
        System.out.println("area of rectangle:"+length*breadth);
    }
}
