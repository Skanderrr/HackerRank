import java.util.Scanner;

public class MiniMaxSum {
    static void miniMaxSum(long[] arr) {
        long max = arr[0];
        long min = arr[0];
        long sum = 0;
        // Complete this function
        for ( int i = 0; i <5; i++ ) {
           sum += arr[i];
           if ( arr[i] > max )
               max = arr[i];
           if ( arr[i] < min )
               min = arr[i];

        }

        System.out.printf ( "%d %d", sum - max, sum - min );
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        long[] arr = new long[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextLong ();
        }
        miniMaxSum(arr);
        in.close();
    }
}
