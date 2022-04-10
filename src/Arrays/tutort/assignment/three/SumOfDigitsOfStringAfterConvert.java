package Arrays.tutort.assignment.three;

//https://leetcode.com/problems/sum-of-digits-of-string-after-convert/

public class SumOfDigitsOfStringAfterConvert {

    public static void main(String[] args) {
        int res = getLucky("iiii", 1);
        System.out.println(res);
        int res1 = getLucky("leetcode", 2);
        System.out.println(res1);
        int res2 = getLucky("zbax", 2);
        System.out.println(res2);
        int res3 = getLucky("dlzlqinpnldxla", 3);
        System.out.println(res3);
    }

    public static int getLucky(String s, int k) {
        int sum = 0;
        sum = getFirstTransformation(s, sum);
        k--; // because 1st transformation is done in above step
        if (k > 0) {
            sum = processKTimes(k, sum);
        }
        return sum;
    }

    private static int getFirstTransformation(String s, int sum) {
        for (int i = 0; i < s.length(); i++) {
            int temp = s.charAt(i) - 96;  //since ascii value of 'a' is 97 and 'z' is 122.
            // so we can get desired int value by just subtracting 96
            //you can also do like this int temp = (ch - 'a') + 1; // adding 1 -> as a = 1
            if (temp > 9) {
                sum += (temp % 10) + (temp / 10);  //because character will always be from 1 to 26. so number of digits are never more then two
            } else {
                sum += temp;
            }
        }
        return sum;
    }

    private static int processKTimes(int k, int sum) {
        while (k > 0) {
            int temp = sum;
            sum = 0;
            while (temp > 0) {
                int r = temp % 10;
                temp/= 10;
                sum += r;
            }
            k--;
        }
        return sum;
    }


}
