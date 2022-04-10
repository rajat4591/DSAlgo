package Arrays.tutort.assignment.three;

//https://leetcode.com/problems/power-of-two/
public class Star_PowerOfTwo {
    public static void main(String[] args) {
        boolean res=isPowerOfTwo(14);
        System.out.println("isPowerOfTwo::"+res);
    }

    private static boolean isPowerOfTwoRecusive(long x,int n){
       /* if(n & (n-1)==0){

        }*/
        return false;
    }

    private static boolean isPowerOfTwo(int n){
        if(n<=0) return false;
        if(n==1 || n==2) return true;
        long temp=2;
        while(temp<=n){
            temp*=2;
            if(temp==n){
                return true;
            }
        }
        return temp==n;
    }
}
