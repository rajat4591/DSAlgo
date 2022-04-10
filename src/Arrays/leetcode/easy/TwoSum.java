package Arrays.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        int target = 6;
        int[] arr = {3, 3};
        int[] res = obj.twoSumOptimizedSinglePass(arr, target);
        System.out.println(res[0] + "," + res[1]);
    }

    public int[] twoSumBruteOptimizedTwoPass(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i]) && map.get(target - arr[i]) != i) {
                return new int[]{i, map.get(target - arr[i])};
            }
        }

        return new int[]{-1, -1};
    }

    public int[] twoSumOptimizedSinglePass(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i]) && map.get(target - arr[i]) != i) {
                return new int[]{i, map.get(target - arr[i])};
            } else {
                map.put(arr[i], i);
            }
        }
        return new int[]{-1, -1};
    }

    public int[] twoSumBruteForce(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

}
