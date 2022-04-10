package Arrays.tutort.assignment.one;
/*
Q7. Given an array of length N, at each step it is reduced by 1 element. In the first step the maximum
element would be removed, while in the second step minimum element of the remaining array would
be removed, in the third step again the maximum and so on. Continue this till the array contains only 1
element. And find the final element remaining in the array.
Example 1:
Input:
N = 7
A[] = {7, 8, 3, 4, 2, 9, 5}
Ouput:
5
Explanation:
In first step '9' would be removed, in 2nd step
'2' will be removed, in third step '8' will be
removed and so on. So the last remaining
element would be '5'.
Example 2:
Input:
N = 8
A[] = {8, 1, 2, 9, 4, 3, 7, 5}
Ouput:
4

        */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Question7 {

    public static void main(String[] args) {
        int[] arr =  {7, 8, 3, 4, 2, 9, 5};
        int ans = solve1(arr);
        System.out.println(ans);

        int ans1 = solve(arr);
        System.out.println(ans1);
    }
    //TC: O(NlogN) SC O(N) approach solve1
    //TC: O(NlogN) SC O(1) approach solve



    private static int solve1(int[] arr) {
        Arrays.sort(arr);
        List<Integer> list=IntStream.of(arr).boxed().collect(Collectors.toList());
        int count=0;
        while(list.size()>1){
            if(count%2==0){
                list.remove(list.size()-1);
            }else{
                list.remove(0);
            }
            count++;
        }
        if(list.size()==1){
            return list.get(0);
        }
        return -1;
    }

    private static int solve(int[] arr) {
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        int count=0;
        while(i<=j){
            if(count%2==0){
                j--;
            }else{
                i++;
            }
            count++;
        }
        return arr[i];
    }
}
