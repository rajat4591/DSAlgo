package Arrays.TwoDArray;

public class MaxColumnSumInMatrix {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
        int[][] arr={{1,2,3},
                {4,5,6},
                {7,8,9},{10,11,12}};

        /*
        * 1 4  7
        * 2 5  8
        * 3 6  9
        * 8 10 11
        * */

        int m=arr.length; int n = arr[0].length;
        for (int j = 0; j < n; j++) {
            int sum=0;
            for (int i = 0; i < m; i++) {
                System.out.print(i+""+j+",");
                sum+=arr[i][j];
            }
            if(sum>max){
                max=sum;
            }
        }
        System.out.println(max);
    }

    private static int maxColumnSum() {
        return -1;
    }


}
