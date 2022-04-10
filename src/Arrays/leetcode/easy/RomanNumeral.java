package Arrays.leetcode.easy;

//https://leetcode.com/problems/roman-to-integer/

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {
    static Map<Character,Integer> map = new HashMap<>();

    public static void main(String[] args) {
        String s = "MCMXCIV";
        int res = romanToInt(s);
        System.out.println(res);
    }

    static {

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
    }

    private static int romanToInt(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            if(i!= s.length()-1 && (s.charAt(i)=='I' || s.charAt(i)=='X' || s.charAt(i)=='C')){
                switch (s.charAt(i)){
                    case 'I':
                        if(s.charAt(i+1)=='V' || s.charAt(i+1)=='X'){
                            res=res+(map.get(s.charAt(i+1))-1);
                            i++;
                            break;
                        }
                    case 'X':
                        if(s.charAt(i+1)=='L' || s.charAt(i+1)=='C'){
                            res=res+(map.get(s.charAt(i+1))-10);
                            i++;
                            break;
                        }
                    case 'C':
                        if(s.charAt(i+1)=='D' || s.charAt(i+1)=='M'){
                            res=res+(map.get(s.charAt(i+1))-100);
                            i++;
                            break;
                        }
                    default:
                        res+=map.get(s.charAt(i));
                }
            } else{
                res+=map.get(s.charAt(i));
            }
        }
        return res;
    }


}
