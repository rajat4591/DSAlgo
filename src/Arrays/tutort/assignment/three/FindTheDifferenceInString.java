package Arrays.tutort.assignment.three;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/find-the-difference/
public class FindTheDifferenceInString {

    public static void main(String[] args) {
        char res = findTheDifferenceUsingXOR("abcd", "dabcz");
        System.out.println(res);
    }

    public static char findTheDifferenceUsingHashMap(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
            }
        }
        char c = 0;
        for (Character key : map.keySet()) {
            if (0 != map.get(key)) {
                c = key;
            }
        }
        return c;
    }

    public static char findTheDifferenceUsingSorting(String s, String t) {
        //"abc","aabc"
        if(s.equals("")) return t.charAt(0);
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i = 0, j = 0; i < t.length() && j < s.length(); i++, j++) {
            if(c1[j]!=c2[i]){
                return c2[i];
            }
        }
        return c2[t.length()-1];
    }

    public static char findTheDifferenceUsingSum(String s, String t) {
        int ssum=0;
        int tsum=0;
        for(int i=0;i<s.length();i++){
            ssum+=s.charAt(i);
            tsum+=t.charAt(i);
        }
        tsum+=t.charAt(t.length()-1);
        return (char) (tsum-ssum);
    }

    public static char findTheDifferenceUsingXOR(String s, String t) {
        char res='\0';
        for(int i=0;i<s.length();i++){
            res^=s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            res^=t.charAt(i);
        }
        return res;
    }

    public static char findTheDifferenceUsingXORSinglePass(String s, String t) {
        char res='\0';
        for(int i=0;i<s.length();i++){
            res^=s.charAt(i);
            res^=t.charAt(i);
        }
        return (char)(res ^ (t.charAt(t.length()-1)));
    }

}
