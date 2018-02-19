import java.util.Scanner;

public class TimeConversion {
    static String timeConversion(String s) {
        String[] x = s.split ( ":" );
        String y = "";
        int xx = Integer.parseInt ( x[0] );
        String ss = "";
        if (s.contains ( "PM" )){
            if (xx != 12) {
                xx += 12;
                x[0] = Integer.toString ( xx );
            }
        }
        else if(s.contains ( "AM" ) && xx == 12)
            x[0] = "00";
        for (int i = 0; i< x.length; i++) {
            if ( !x[i].contains ( "M" ) )
                y += x[i] + ":";
            else {
                y += x[i].substring ( 0, 2 );
            }

            }


        return y;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
