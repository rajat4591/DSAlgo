package Arrays.TwoDArray;

public class ColumnWiseTraversal {

    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}};

        columnWiseTraversal(arr);
    }
//I also faced same issue. it's because let's consider matrix is of 3 row and 4 columns.
    //Now I have loop for (int i=0;i<arr.length(i.e no of rows);i++)
        //            for(int j=0;j<arr[0].length(i.e no of columns);j++){
//                  res[i][j]=arr[j][i]
//            }
    private static void columnWiseTraversal(int[][] arr){
        for(int j=0;j<arr[0].length;j++){
        for(int i=0;i<arr.length;i++){
                System.out.println(arr[i][j]);
            }
        }
    }

}
