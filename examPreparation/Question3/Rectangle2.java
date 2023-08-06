package examPreparation.Question3;

public class Rectangle2 {
   public int length;
   public int breath;
    public void computerArea(int length,int breath){
        this.length=length;
        this.breath=breath;
    }
    public int displayArea(){
        int area;
        area=length*breath;
        return area;
    }

}
