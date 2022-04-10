package Arrays.tutort.assignment.two;

public class ThreeConsecutiveOdds {

    /*
        https://leetcode.com/problems/three-consecutive-odds/
    */

    public static void main(String[] args) {
        int[] nums = {1, 2, 34, 3, 4, 5, 7, 23, 12};
        boolean res = threeConsecutiveOdds(nums);
        System.out.println(res);
    }

    // using sliding window concept
    //TC O(N) SC O(1)
    public static boolean threeConsecutiveOdds(int[] arr) {
        int i = 0, j = 0;
        while (i < arr.length && j < arr.length && (j - i + 1) <= 3) {
            if (isOdd(arr[j])) {
                if (j - i + 1 == 3) {
                    return true;
                } else {
                    j++;
                }
            } else {
                i = j + 1;
                j = i;
            }
        }
        return false;
    }

    //TC O(N) SC O(1)
    public static boolean threeConsecutiveOddsUsingCount(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isOdd(arr[i])) {
                count++;
            } else {
                count = 0;
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }

    private static boolean isOdd(int x) {
        return x % 2 != 0;
    }

}
