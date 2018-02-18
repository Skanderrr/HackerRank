import java.util.Scanner;

public class Staircase {
    static void staircase(int n) {
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j <n - i - 1 ; j++ ) {
                System.out.printf (" ");
            }
            for ( int j = n - i - 1; j < n; j++ ) {
                System.out.printf ("#");
            }

            if ( i < n - 1 )
                System.out.println ( "" );

        }

        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
