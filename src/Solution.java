
import java.util.*;
public class Solution {

    static int[] solve ( int a0 , int a1 , int a2 , int b0 , int b1 , int b2 ) {
        // Complete this function
        int[] x = { a0 , a1 , a2 , b0 , b1 , b2 };
        int[] solution = new int[ 2 ];
        int a = 0;
        int b = 0;
        for ( int i = 0 ; i < 3 ; i++ ) {

            if ( x[ i ] > x[ i + 3 ] )
                a += 1;
            if ( x[ i + 3 ] > x[ i ] )
                b += 1;

        }
        solution[ 0 ] = a;
        solution[ 1 ] = b;
        return solution;
    }

    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );
        int a0 = in.nextInt ( );
        int a1 = in.nextInt ( );
        int a2 = in.nextInt ( );
        int b0 = in.nextInt ( );
        int b1 = in.nextInt ( );
        int b2 = in.nextInt ( );
        int[] result = solve ( a0 , a1 , a2 , b0 , b1 , b2 );
        for ( int i = 0 ; i < result.length ; i++ ) {
            System.out.print ( result[ i ] + ( i != result.length - 1 ? " " : "" ) );
        }
        System.out.println ( "" );


    }
}
