package oop.encapsulation.Question3;
// Create a class "Student" with private attributes: studentId (String), name (String), and marks (int[]).
// Implement public getter and setter methods for each attribute.
// Ensure that the studentId is exactly 8 characters long, and the marks array only contains valid marks between 0 and 100.
public class Student {

    private String studnetId;
    private String name;
  //  private int marks[]=new int[5];

    public void setid( String ID){
        if (ID.length()==7){
            System.out.println("id must be exactly 8 character long");
            System.exit(0);
        }
        this.studnetId=ID;
    }
    public String getid(){
        return this.studnetId;
    }

    public void setName(String Name){
        this.name=Name;
    }
    public String getName(){
        return this.name;
    }

//    public void SetMarks(int marks){
//        if(marks>0 && marks<100){
//            marks
//        }
//    }


}
