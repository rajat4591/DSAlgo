package Arrays.tutort.assignment.three;

import java.util.HashSet;
import java.util.Set;
//https://leetcode.com/problems/happy-number/
public class Star_HappyNumber {

    public static void main(String[] args) {
        boolean res = isHappyOptimized(19);
        System.out.println(res);
    }


    private static int digitSquareSum(int n) {
        int sum = 0, tmp;
        while (n > 0) {
            tmp = n % 10;
            sum += tmp * tmp;
            n /= 10;
        }
        return sum;
    }

    // Intuition is that in case of "cycle" slow and fast will meet at some point
    // similar to finding cycle in a linked list
    private static boolean isHappyOptimized(int n) {
        int slow, fast;
        slow = fast = n;
        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(fast);
            fast = digitSquareSum(fast);
        } while (slow != fast);

        return slow == 1;
    }

    public static boolean isHappy(int n) {
        long temp = n;
        long sum = 0;
        Set<Long> sumSeenBefore = new HashSet<>();
        while (sum != 1) {
            while (temp > 0) {
                long r = temp % 10;
                temp = temp / 10;
                sum += Math.pow(r, 2);
            }
            if (sum == 1) {
                return true;
            } else {
                if (!sumSeenBefore.add(sum)) {
                    return false;
                }
                temp = sum;
                sumSeenBefore.add(temp);
                sum = 0;
            }
        }
        return false;
    }

}
