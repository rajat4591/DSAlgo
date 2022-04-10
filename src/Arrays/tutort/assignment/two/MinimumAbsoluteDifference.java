package Arrays.tutort.assignment.two;

import java.util.*;

public class MinimumAbsoluteDifference {

    /*
     *  https://leetcode.com/problems/minimum-absolute-difference/
     * */
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3};
                    //1,2,3,4
        List<List<Integer>> res = minimumAbsDifference(arr);
        System.out.println(res);
    }

    //TC: O(nlogn) SC: O(n) doubt is sc correct??
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        int min=Integer.MAX_VALUE;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            min=Math.min(min,arr[i]-arr[i-1]);
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==min){
                List<Integer> list = new ArrayList<>();
                list.add(arr[i-1]);
                list.add(arr[i]);
                res.add(list);
            }
        }
        return res;
    }

}
