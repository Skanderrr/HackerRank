import java.util.Scanner;

public class PlusMinus {
    static void plusMinus(int[] arr) {
        // Complete this function
        double plus = 0;
        double minus = 0;
        double zeros = 0;
        for ( int i = 0; i < arr.length; i++ ){
            if ( arr[i] > 0 )
                plus += 1;
            else if ( arr[i] < 0 )
                minus += 1;
            else
                zeros += 1;
        }
        System.out.println ( plus / arr.length );
        System.out.println ( minus / arr.length );
        System.out.println ( zeros / arr.length );
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}
