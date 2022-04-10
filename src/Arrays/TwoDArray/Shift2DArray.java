package Arrays.TwoDArray;

import java.util.ArrayList;
import java.util.List;

public class Shift2DArray {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<List<Integer>> finalList = shiftGrid(arr, 11);
        System.out.println(finalList);
    }
/*

    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int res[][] = new int[grid.length][grid[0].length];

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(i==grid.length-1 && j==grid[i].length-1){
                    swap(res[i][j],grid[0][0]);
                } else if(i!=grid.length-1 && j==grid[i].length-1){
                    swap(res[i][j],grid[i+1][0]);
                } else{
                    swap(res[i][j],grid[i][j+1]);
                }

            }
        }
*/

    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int noOfElements=grid.length*grid[0].length;
        k=k%noOfElements;
        while(k>0) {
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length - 1; j++) {
                    int temp = grid[0][0];
                    grid[0][0] = grid[i][j + 1];
                    grid[i][j + 1] = temp;
                }
                if (i < grid.length - 1) {
                    int j = grid[i].length;
                    int temp = grid[0][0];
                    grid[0][0] = grid[i + 1][0];
                    grid[i + 1][0] = temp;
                }
            }
            k--;
        }
        List<List<Integer>> finalList = new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<grid[i].length;j++){
                list.add(grid[i][j]);
            }
            finalList.add(list);
        }

        return finalList;
    }

       /* List<List<Integer>> finalList = new ArrayList<>();
        for(int i=0;i<res.length;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<res[i].length;j++){
                list.add(res[i][j]);
            }
            finalList.add(list);
        }

        return finalList;

        */
}

