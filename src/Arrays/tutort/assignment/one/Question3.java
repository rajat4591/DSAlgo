package Arrays.tutort.assignment.one;
/*
Q3. Given an sorted array A of size N. Find number of elements which are less than or equal to given
element X.
Example 1:
Input:
N = 6
A[] = {1, 2, 4, 5, 8, 10}
X = 9
Output:
5
Example 2:
Input:
N = 7
A[] = {1, 2, 2, 2, 5, 7, 9}
X = 2
Output:
4
*/

public class Question3 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 5, 7, 9};
        int x = 2;
        //int[] arr = {1, 2, 4, 5, 8, 10};
        //int x = 8;
        int count=0;
        for(int i:arr){
            if(i<=x){
                count++;
            }
        }
        System.out.println(count);
    }

    /*private static int binarySearch(int[] arr, int x, int l, int r) {
        while (r >= l) {
            int mid = (l + r) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                return binarySearch(arr, x, l, mid - 1);
            } else {
                return binarySearch(arr, x, mid + 1, r);
            }
        }
        return -1;
    }*/

}
