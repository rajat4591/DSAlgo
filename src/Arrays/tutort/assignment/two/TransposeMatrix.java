package Arrays.tutort.assignment.two;

public class TransposeMatrix {

    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][] res=transpose(matrix);
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.println(res[i][j]);
            }
        }
    }

    //TC O(m*n) SC O(m*n)
    private static int[][] transpose(int[][] matrix) {
        int m=matrix.length; //row
        int n=matrix[0].length; //col
        int[][] res=new int[n][m]; //reverse rows and cols
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j]=matrix[j][i];
            }
        }
        return res;
    }

}
