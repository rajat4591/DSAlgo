package Arrays.tutort.classroom;

public class MaxAndSecondMaxInArray {


    int[] solve(int[] arr, int n) {
        if (arr.length == 0) {
            return new int[]{-1,-1};
        }
        if (arr.length < 2) {
            return new int[]{};
        }
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {

            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax) {
                secMax = arr[i];
            }
        }
        return new int[]{max,secMax};
    }
//TC: O(n) SC: O(1)


}
