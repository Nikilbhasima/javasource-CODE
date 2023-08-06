package array;

public class MultiDimensionalArray {
    public static void main(String[] args){
        String[][] array={{"java","c++","c"},
                {"pythan","c#","js"}};
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
