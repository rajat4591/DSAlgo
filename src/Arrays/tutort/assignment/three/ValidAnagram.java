package Arrays.tutort.assignment.three;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {
        //Test case
        boolean res=isAnagramUsingSorting("anagram","nagarbm");
        System.out.println(res);
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false; // if length of both strings are not equal, then for sure they are not anagrams and we can safely return false
        Map<Character,Integer> map = new HashMap<>(); // define a dictionary to store frequency of characters in string
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1); //prepare frequency of all characters in string s
        }
        for(int i=0;i<t.length();i++){
            if(!map.containsKey(t.charAt(i))){
                return false;  // if this particular character itself is not present in string 't', then you can safely return false
            } else{
                map.put(t.charAt(i),map.get(t.charAt(i))-1); //else just keep on decreasing frequency of each character by 1
            }
        }
        //By now if both strings are anagrams, map should have frequency of each character as 0.
        //So you can filter with values 0 and find the count
        long count=map.values().stream().filter(x->x==0).count();

        //if all characters have frequency as 0 at this stage, it means both strings are anagrams
        return count==map.size();
    }

    public static boolean isAnagramUsingSorting(String s, String t) {
        if(s.length()!=t.length()) return false;
        //Another simple approach is to sort both the strings. so convert strings to char array and sort them
        char[] c1=s.toCharArray();
        char[] c2=t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        //Once both char arrays are sorted. you can iterate from index 0 to length-1
        //if any character mismatches then its not an anagram
        for(int i=0;i<s.length();i++){
            if(c1[i]!=c2[i]){
                return false;
            }
        }
        return true;
    }

}
