package Arrays.tutort.assignment.one;
/*
Q1. Given an array of N integers. Your task is to print the sum of all of the integers.
        Example 1:
        Input:
        4
        1 2 3 4
        Output:
        10
        Example 2:
        Input:
        6
        5 8 3 10 22 45
        Output:
        93*/

public class Question1 {

    //TC O(N), SC: O(1)
    public static void main(String[] args) {
        int[] arr={1,2,34,5,6};
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        System.out.println(sum);
    }

}
