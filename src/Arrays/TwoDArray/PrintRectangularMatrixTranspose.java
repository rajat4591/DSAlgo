package Arrays.TwoDArray;

//discussed in class
public class PrintRectangularMatrixTranspose {

    public static void main(String[] args) {
        int[][] arr={{1,2},{3,4},{5,6}};
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<=i;j++){
                System.out.print(i+" "+j);
                System.out.println();
            }

        }
    }

}
