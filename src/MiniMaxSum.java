import java.util.Scanner;

public class MiniMaxSum {
    static void miniMaxSum(int[] arr) {
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
