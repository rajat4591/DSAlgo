package Arrays.leetcode.easy;
//https://leetcode.com/explore/featured/card/fun-with-arrays/525/inserting-items-into-an-array/3245/
/*
Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.
Example 1:
Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
Example 2:

Input: arr = [1,2,3]
Output: [1,2,3]
Explanation: After calling your function, the input array is modified to: [1,2,3]
*/

public class DuplicateZeros {

    public static void main(String[] args) {
        int[] arr = {1};
        duplicateZeros(arr);
    }


    public static void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0 && i+1<arr.length){
                insertZero(arr,i+1);
                i++;
            }
        }

        System.out.println("after movement");
        for(int i:arr){
            System.out.println(i+",");
        }
    }
    //Input: arr = [1,0,2,3,0,4,5,0]
    private static void insertZero(int[] arr, int x) {
        for(int i=arr.length-2;i>=x;i--){
            arr[i+1]=arr[i];
        }
        arr[x]=0;
    }
}
