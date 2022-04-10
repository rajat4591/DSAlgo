package Arrays.leetcode.easy;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"cir", "car"};
        String res = longestCommonPrefix(strs);
        System.out.println("longest common prefix::" + res);
    }


    public static String longestCommonPrefixUsingSort(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < (first.length() < last.length() ? first.length() : last.length())) {
            if(first.charAt(i)==last.charAt(i)){
                sb.append(first.charAt(i));
                i++;
            } else{
                break;
            }
        }
        return sb.toString();
    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            prefix = compute(prefix, strs[i]);
        }
        return prefix;
    }

    // TC O(N*S) SC O(1)
    private static String compute(String prefix, String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; str.length() < prefix.length() ? i < str.length() : i < prefix.length(); i++) {
            if (str.charAt(i) == prefix.charAt(i)) {
                sb.append(str.charAt(i));
            } else {
                break;
            }
        }
        return sb.toString();
    }

}
