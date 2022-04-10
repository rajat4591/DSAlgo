package random;
/*
Q-3: Pattern Printing-2
        Test Case-1:
        N = 5
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
*/

public class PatternPrinting2 {

    public static void main(String[] args) {
        int n=10;
        int count=1;
        int printcount=1;
        while(count<=n){
            for(int i=1;i<=count;i++){
                System.out.print(count+" ");
                printcount++;
            }
            System.out.println();
            count++;
        }
    }
}
