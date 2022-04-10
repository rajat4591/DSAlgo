package Arrays.TwoDArray;

public class MatrixDiagonalDiffHackerRank {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int res = solve1(arr);
        System.out.println(res);
    }

    private static int solve1(int[][] arr) {
        int psum = 0;
        int ssum = 0;
        int n = arr[0].length;
        for (int i = 0,j=arr[0].length-1; i < arr[0].length && j>=0; i++,j--) {
            psum += arr[i][i];  // because for primary diagonal i=j
            ssum += arr[j][i];  //use either [j][i] or [i][j]
            System.out.print(i+""+j+",");
        }

        return Math.abs(psum - ssum);
    }

    private static int solve(int[][] arr) {
        int psum = 0;
        int ssum = 0;
        int n = arr[0].length;
        for (int i = 0; i < arr[0].length; i++) {
            psum += arr[i][i];  // because i=j
            ssum += arr[i][n - 1 - i];  //because i+j=n-1
        }

        return Math.abs(psum - ssum);
    }

}
