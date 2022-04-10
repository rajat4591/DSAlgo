package Arrays.leetcode.easy;

public class GreaterElementRightIncluding {

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
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
            }
            arr[i]=max;
        }
        return arr;
    }


}
