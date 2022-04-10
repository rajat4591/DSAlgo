package Arrays.tutort.assignment.two;

public class Star_MoveZeros {

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 0, 1, 0, 2, 0, 3, 0, 9, 0, 0, 0, 0, 0, 1, 0};
        int[] res = moveZeroesOptimized(nums);
        for (int i : res) {
            System.out.print(i + " ,");
        }
    }

    //TC: O(N) SC: O(1)
    // with 1 iteration
    private static int[] moveZeroesOptimized(int[] nums) {
        int placeNonZeroHere = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(nums,placeNonZeroHere,i);
                placeNonZeroHere++;
            }
        }
        return nums;
    }

    private static void swap(int [] nums, int placeNonZeroHere, int x){
        int temp=nums[placeNonZeroHere];
        nums[placeNonZeroHere]= nums[x];
        nums[x]=temp;
    }

    //TC: O(N) SC: O(1)
    // with 2 iteration
    private static int[] moveZeroes(int[] nums) {
        int placeNonZeroHere = 0;
        // If the current element is not 0, then we need to
        // append it just in front of last non 0 element we found.
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[placeNonZeroHere] = nums[i];
                placeNonZeroHere++;
            }
        }
        // After we have finished processing non zero elements,
        // all of them are already at beginning of array.
        // We just need to fill remaining array with 0's.
        for (int i = placeNonZeroHere; i < nums.length; i++) {
            nums[i] = 0;
        }
        return nums;
    }

}
