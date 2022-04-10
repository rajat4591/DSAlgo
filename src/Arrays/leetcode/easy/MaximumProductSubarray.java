package Arrays.leetcode.easy;

/*https://leetcode.com/problems/maximum-product-subarray/*/
public class MaximumProductSubarray {

    public static void main(String[] args) {
        int[] arr = {2,3,-2,4};
        int ans = solve1(arr);
        System.out.println(ans);
    }

    private static int solve(int[] nums) {
        int product = 1;
        int maxProd = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                product = product * nums[i];
            } else {
                if (product > maxProd) {
                    maxProd = product;
                }
                product = 1;
            }
        }
        if (product > maxProd) {
            maxProd = product;
        }
        return maxProd;
    }

    private static int solve1(int[] nums) {
        int product = nums[0];
        int maxProd = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > product) {
                product = product * nums[i];
            } else {
                if (product > maxProd) {
                    maxProd = product;
                }
                product = 1;
            }
        }
        if (product > maxProd) {
            maxProd = product;
        }
        return maxProd;
    }

}
