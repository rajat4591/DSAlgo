package Arrays.tutort.assignment.one;
/*
Q5. Given an array Arr of N positive integers. Your task is to find the elements whose value is equal
to that of its index value ( Consider 1-based indexing ).
Example 1:
Input:
N = 5
Arr[] = {15, 2, 45, 12, 7}
Output: 2
Explanation: Only Arr[2] = 2 exists here.
Example 2:
Input:
N = 1
Arr[] = {1}
Output: 1
Explanation: Here Arr[1] = 1 exists.

        */

public class Question5 {

    public static void main(String[] args) {
        int[] arr = {9,8,3,6,5,4,3,2,1,10,11};
        int n = 5;
        int count=1;
        for(int i:arr){
            if(count==i) {
                System.out.println(i);
            }
            count++;
        }
    }
    //TC: O(N) SC O(1)

}
