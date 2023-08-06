package array;

public class ArrayString {
    public static void main(String[] args){
        String[] name={"kist","nist","pist"};
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
//for each loop
        for (String s:name) {
            if(s.equalsIgnoreCase("Nist")){
                System.out.println("true");
            }
            else {
                System.out.println(false);
            }

        }


    }
}

