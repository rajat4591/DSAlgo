package Arrays.tutort.assignment.one;
/*
Q4. You are given an array A of size N. You need to print elements of A in alternate order (starting
from index 0).
Example 1:
Input:
N = 4
A[] = {1, 2, 3, 4}
Output:
1 3
Example 2:
Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
1 3 5

        */

public class Question4 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,5};
        int n = 5;
        for(int i=0;i<n;i=i+2){
            System.out.println(arr[i]);
        }
    }
    //TC: O(N) SC O(1)

}
