package Arrays.tutort.assignment.two;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*https://leetcode.com/problems/majority-element/*/
public class Star_MajorityElement {

    public static void main(String[] args) {
        int[] nums={3,2,3};
        int res=majorityElementUsingBoyerMoore(nums);
        System.out.println(res);
    }

    //TC O(N) SC O(1)
    public static int majorityElementUsingBoyerMoore(int[] nums) {
        int majorityE=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==majorityE){
                count++;
            } else{
                count--;
                if(count==0){
                    majorityE=nums[i];
                    count=1;
                }
            }
        }
        return majorityE;
    }

    //TC: O(N) SC O(N)
    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if((map.get(nums[i])+1)>(nums.length/2)){
                    return nums[i];
                } else{
                    map.put(nums[i],map.get(nums[i])+1);
                }
            } else{
                map.put(nums[i],1);
            }
        }
        return nums[0];
    }

}
