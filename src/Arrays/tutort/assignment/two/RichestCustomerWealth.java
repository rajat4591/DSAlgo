package Arrays.tutort.assignment.two;

public class RichestCustomerWealth {

    /*
    * https://leetcode.com/problems/richest-customer-wealth/
    * */
    public static void main(String[] args) {
        RichestCustomerWealth obj = new RichestCustomerWealth();
        int[][] arr= {{1,2,3},{3,2,1}};
        int res=obj.maximumWealth(arr);
        System.out.println(res);
    }

    //TC O(m*n) SC:O(1)
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[0].length; j++) {
                sum += accounts[i][j];
            }
            max = Math.max(max, sum);
            sum=0;
        }
        return max;
    }

}
