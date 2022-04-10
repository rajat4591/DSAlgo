package Arrays.tutort.assignment.two;

public class RunningSumOfOneDArray {

    /*
        https://leetcode.com/problems/running-sum-of-1d-array/
    */

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] res = runningSum(nums);
    }
    //TC O(N) SC O(1)
    public static int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }

}
