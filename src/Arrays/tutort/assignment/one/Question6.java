package Arrays.tutort.assignment.one;
/*
Q6. Given an array of size N and you have to tell whether the array is perfect or not. An array is said
to be perfect if it's reverse array matches the original array. If the array is perfect then print
"PERFECT" else print "NOT PERFECT".
Example 1:
Input : Arr[] = {1, 2, 3, 2, 1}
Output : PERFECT
Explanation:
Here we can see we have [1, 2, 3, 2, 1]
if we reverse it we can find [1, 2, 3, 2, 1]
which is the same as before.
So, the answer is PERFECT.
Example 2:
Input : Arr[] = {1, 2, 3, 4, 5}
Output : NOT PERFECT
        */

public class Question6 {

    public static void main(String[] args) {
        int[] arr = {1,2,2,1};
        if (solve(arr)) {
            System.out.println("PERFECT");
        } else {
            System.out.println("NOT PERFECT");
        }
    }
    //TC: O(N) SC O(1)

    private static boolean solve(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            if (arr[i] != arr[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
