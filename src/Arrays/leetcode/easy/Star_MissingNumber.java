package Arrays.leetcode.easy;

import java.util.Arrays;

public class Star_MissingNumber {

    public static void main(String[] args) {
        int nums[]={0,1};
        int res=missingNumberOptimized(nums);
        System.out.println(res);
    }

    private static int missingNumberOptimized(int[] nums) {
        int n=nums.length;
        int sum= (n*(n+1))/2;
        for(int i=0;i<nums.length;i++){
            sum-= nums[i];
        }
        return sum;
    }

    public static int missingNumberBruteForce(int[] nums) {
        if(nums.length==1){
            return nums[0]==0?1:0;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                return i;
            }
        }
        //to handle the use case where missing number =n
        return nums.length;
    }

}
