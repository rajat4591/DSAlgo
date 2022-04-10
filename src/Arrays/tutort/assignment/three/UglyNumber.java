package Arrays.tutort.assignment.three;

import java.util.ArrayList;
import java.util.List;

public class UglyNumber {

    public static void main(String[] args) {
        boolean res = isUgly(13);
        System.out.println(res);

    }

    public boolean isUglyOptimized(int n) {
        if(n<=0) return false;
        int i=2;
        while(n!=1){
            if(n%i==0){
                n=n/i;
            } else{
                i++;
                if(i>5){
                    return false;
                }
            }
        }
        return true;

    }

    private static List<Integer> factors(int n){
        List<Integer> factors= new ArrayList<>();
        int i=2;
        while(n!=1){
            if(n%i==0){
                n=n/i;
                factors.add(i);
            } else{
                i++;
            }
        }
        return factors;
    }

    public static boolean isUgly(int n) {
        if(n<=0) return false;
        List<Integer> factors= factors(n);
        System.out.println(factors);
        long count=factors.stream().filter(x->(x!=1 && x!=2 && x!=3 && x!=5)).count();
        return count==0;
    }
}
