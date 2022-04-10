package random;
/*
Q-2: Pattern Printing
        N = 5                      N=6

        *****                      ******
        ****                       *****
        ***                        ****
        **                         ***
        *                          **
                                   *
*/

public class PatternPrinting {
    public static void main(String[] args) {
        int n = 6;
        while(n>0){
            for (int j = n; j >=1 ; j--) {
                System.out.print("*");
            }
            System.out.println();
            n--;
        }


    }
}
