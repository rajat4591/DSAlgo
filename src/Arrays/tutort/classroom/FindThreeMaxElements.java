package Arrays.tutort.classroom;
import java.util.Arrays;
import java.util.List;

public class FindThreeMaxElements {

    public static void main(String[] args) {
        int[] arr={10,1,-1};
        List<Integer> res= threeMax(arr,arr.length);
        System.out.println(res);
    }

    private static List<Integer> threeMax(int[] arr, int n){
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        int thirdMax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                thirdMax=secMax;
                secMax=max;
                max=arr[i];
            } else if(arr[i]>secMax){
                thirdMax=secMax;
                secMax=arr[i];
            } else if(arr[i]>thirdMax){
                thirdMax=arr[i];
            }
        }
        List<Integer> res= Arrays.asList(max,secMax,thirdMax);
        return res;
    }

}
