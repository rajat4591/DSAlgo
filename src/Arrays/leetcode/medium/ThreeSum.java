package Arrays.leetcode.medium;

import java.util.*;
import java.util.stream.Collectors;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {3, 0, 3, 2, -4, 0, -3, 2, 2, 0, -1, -5};
        List<List<Integer>> res = threeSumOptimized(nums);
        System.out.println(res);
    }

    //TC: O(N^2) SC: O(N)
    public static List<List<Integer>> threeSumOptimized(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) set.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                else if (sum > 0) k--;
                else j++;
            }
        }
        return new ArrayList<>(set);
    }


    public static List<List<Integer>> threeSum(int[] arr) {
        List<Integer> orig = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[i] + arr[j];
                int index = orig.indexOf(-temp);
                if (index != -1 && index != i && index != j) {
                    list = Arrays.asList(arr[i], arr[j], -temp);
                    Collections.sort(list);
                    if (!res.contains(list)) {
                        res.add(list);
                    }
                }
            }
        }
        return res;
    }

    public static List<List<Integer>> threeSumBruteForce(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        list = Arrays.asList(arr[i], arr[j], arr[k]);
                        Collections.sort(list);
                        if (!res.contains(list)) {
                            res.add(list);
                        }
                    }
                }
            }
        }
        return res;
    }
}
