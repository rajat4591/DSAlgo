package Arrays.tutort.assignment.one;
/*
Q8. Given an array of N distinct elements, the task is to find all elements in array except two greatest
elements in sorted order.
Example 1:
Input :
a[] = {2, 8, 7, 1, 5}
Output :
1 2 5
Explanation :
The output three elements have two or
more greater elements.
Example 2:
Input :
a[] = {7, -2, 3, 4, 9, -1}
Output :
-2 -1 3 4

        */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Question8 {

    public static void main(String[] args) {
        int[] arr =  {7, -2, 3, 4, 9, -1};
        solve(arr);
    }
    //TC: O(NlogN) SC O(1)

    private static void solve(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
            System.out.println(arr[i]);
        }
    }
}
