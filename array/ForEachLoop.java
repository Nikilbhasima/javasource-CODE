package array;

public class ForEachLoop {
    public static void main(String[] args){
        int[] number={3,4,5,6,5};
        int sum=0;
        for(int n:number){
          //  System.out.println(n);
            sum+=n;
        }
        System.out.println(sum);
    }
}


// for each loop
/*for(int n:numbers){
}
* */