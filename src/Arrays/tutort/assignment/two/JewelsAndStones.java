package Arrays.tutort.assignment.two;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JewelsAndStones {

    /*
        https://leetcode.com/problems/jewels-and-stones/
     */
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int res= numJewelsInStonesOptimized(jewels, stones);
        System.out.println(res);
    }

    //TC O(S) SC O(1)
    //Doubt: String.indexOf and List.contains both are O(N) complexity. So will TC of this becomes O(N^2)?
    public static int numJewelsInStonesOptimized(String jewels, String stones) {
        int num = 0;
        for (int i = 0 ; i < stones.length(); i ++) {
            if(jewels.indexOf(stones.charAt(i)) != -1) {
                num++;
            }
        }
        return num;
    }
    //TC O(S) SC O(1)
    public static int numJewelsInStones(String jewels, String stones) {
        List<Character> list = jewels.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        char[] s = stones.toCharArray();
        int count=0;
        for(int i=0;i<s.length;i++){
            if(list.contains(s[i])){
                count++;
            }
        }
        return count;
    }

}
