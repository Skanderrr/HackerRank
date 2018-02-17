import java.util.Scanner;

import static java.lang.Math.abs;

public class DiagonalDifference {

    static int diagonalDifference(int[][] a) {
        // Complete this function
        int sum1 = 0;
        int sum2 = 0;
        for ( int i = 0; i < a[0].length; i++ ){
            sum1 += a[i][i];
        }
        for ( int j = a[0].length - 1; j > 0; j-- ) {
            sum2 += a[j][j];
        }

        return abs(sum2 - sum1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}
