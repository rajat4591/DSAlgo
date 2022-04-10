package Arrays.tutort.assignment.three;

//https://leetcode.com/problems/add-digits/
public class AddDigits {

    public static void main(String[] args) {
        int res = addDigits(0);
        System.out.println(res);
    }

    public static int addDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int r = num % 10;
            num = num / 10;
            if(num==0 && sum>9){
                num=sum;
                sum=0;
            }
        }
        return num;
    }
}
