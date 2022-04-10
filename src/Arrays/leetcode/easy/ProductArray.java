package Arrays.leetcode.easy;
public class ProductArray {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9};
        //{6,8,15,24,30}
        int[] res=solve1(arr);
        for(int x:res){
            System.out.println(x);
        }
    }
    private static int[] solve1(int[] arr){
        int temp=arr[0];
        arr[0]=arr[0]*arr[1];
        for(int i=1;i<arr.length-1;i++){
            int curr= arr[i];
            arr[i]=temp*arr[i+1];
            temp=curr;
        }
        arr[arr.length-1]=arr[arr.length-1]*temp;
        return arr;
    }


    private static int[] solve(int[] arr){
        int[] res= new int[arr.length];
        for(int i=1;i<arr.length-1;i++){
            res[i]=arr[i-1]*arr[i+1];
        }
        res[0]=arr[0]*arr[1];
        res[res.length-1]=arr[res.length-1]*arr[res.length-2];
        return res;


    }


}
