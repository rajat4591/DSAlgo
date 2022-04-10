package Arrays.leetcode.easy;

public class GreaterElementRightExcluding {

    public static void main(String[] args) {
        int[] arr = {6, 8, 5, 2, 4, 1};
        //6 8 5 2 1 -1
        //temp=4, curr=2
        //8 5 4 4 1 -1
        int[] res = solveOptimized(arr, arr.length);
        for (int x : res) {
            System.out.println(x);
        }
    }

    private static int[] solveOptimized(int[] arr, int n) {

        return arr;
    }


    private static int[] solveBruteForce(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            arr[i] = max;
            max = Integer.MIN_VALUE;
        }
        return arr;
    }

}
