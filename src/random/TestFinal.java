package random;

public class TestFinal {
    public static void main(String[] args) {
        int[] nums={1,1,2};
        int res=thirdMax(nums);
        System.out.println(res);
    }

    public static int thirdMax(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums.length==2) {
            return nums[0]>nums[1]?nums[0]:nums[1];
        }
        long max=Long.MIN_VALUE;
        long secMax=Long.MIN_VALUE;
        long third=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                third=secMax;
                secMax=max;
                max=nums[i];
            } else if(nums[i]>secMax && nums[i]!=max){
                third=secMax;
                secMax=nums[i];
            } else if(nums[i]>third && nums[i]!=secMax && nums[i]!=max){
                third=nums[i];
            }
        }

        return third==Long.MIN_VALUE? (int)max: (int)third;
    }

}
