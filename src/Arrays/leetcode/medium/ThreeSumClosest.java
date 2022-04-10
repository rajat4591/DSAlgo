package Arrays.leetcode.medium;

import java.util.*;

public class ThreeSumClosest {

    public static void main(String[] args) {
        int[] arr = {0,2,1,-3};
        int res = threeSumClosest(arr, 1);
        System.out.println(res);
    }

    public static int threeSumClosest(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(arr);
        int i = 0, j = 1, k = arr.length - 1;
        while (j < k) {
            if (arr[i] + arr[j] + arr[k] == target) {
                return arr[i] + arr[j] + arr[k];
            } else if (arr[i] + arr[j] + arr[k] < target) {
                map.put(target - (arr[i] + arr[j] + arr[k]), arr[i] + arr[j] + arr[k]);
                i++;
                j++;
            } else {
                map.put((arr[i] + arr[j] + arr[k]) - target, arr[i] + arr[j] + arr[k]);
                k--;
            }
        }
        Map.Entry<Integer, Integer> min = Collections.min(map.entrySet(), new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2) {
                return entry1.getKey().compareTo(entry2.getKey());
            }
        });

        return min.getValue();
    }

}
