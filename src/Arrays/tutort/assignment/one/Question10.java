package Arrays.tutort.assignment.one;
/*

Q10. Given a number N. Your task is to check whether it is fascinating or not.
Fascinating Number: When a number(should contain 3 digits or more) is multiplied by 2 and 3 ,and
when both these products are concatenated with the original number, then it results in all digits from 1
to 9 present exactly once.
Example 1:
Input:
N = 192
Output: Fascinating
Explanation: After multiplication with 2
and 3, and concatenating with original
number, number will become 192384576
which contains all digits from 1 to 9.
Example 2:
Input:
N = 853
Output: Not Fascinating
Explanation: It's not a fascinating
number.

        */

import java.util.HashMap;
import java.util.Map;

public class Question10 {

    public static void main(String[] args) {

        boolean isFascinating=solve(853);
        System.out.println(isFascinating);
    }

    //TC: O(Size(N)) SC O(N)
    private static boolean solve(int n) {
        if(n>99){
            StringBuilder sb = new StringBuilder(String.valueOf(n));
            Map<Long,Integer> map = new HashMap<>(9);
            for(int i=1;i<=9;i++){
                map.put((long)i,0);
            }
            int multipleTwo= n*2;
            int multipleThree= n*3;
            sb.append(multipleTwo).append(multipleThree);
            long x=Long.parseLong(sb.toString());
            while(x>0){
                long remainder= x%10;
                if(remainder==0){
                    return false;
                }
                map.put(remainder,map.get(remainder)+1);
                x=x/10;
            }

            long res=map.values().stream().filter(y-> (y==0 || y>1)).count();
            if(res>0){
                return false;
            } else{
                return true;
            }
        }
        return false;
    }


}
