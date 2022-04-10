package Arrays.tutort.assignment.one;
/*

Q9. Write a program to find the sum of the given series 1+2+3+ . . . . . .(N terms)
Example 1:
Input:
N = 1
Output: 1
Explanation: For n = 1, sum will be 1.
Example 2:
Input:
N = 5
Output: 15
Explanation: For n = 5, sum will be 1
+ 2 + 3 + 4 + 5 = 15.

        */

import java.util.Arrays;

public class Question9 {

    public static void main(String[] args) {

        int sum=solveOptimized(50);
        System.out.println(sum);
    }

    //TC: O(N) SC O(1)
    private static int solve(int n) {
        int i=1,sum=0;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        return sum;
    }

    //TC: O(1) SC O(1)
    private static int solveOptimized(int n) {
        return (n*(n+1))/2;
    }
}
