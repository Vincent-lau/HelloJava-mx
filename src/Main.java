import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    /*
    call functions from other class
    this keyword

    ------input----> f -----> output


     */


//    public static String f(int x) {
//        return "cc";
//    }
//





    public static String f(char d, int x) {
        return "cc";
    }

    public static String f(int x, int y, int z) {
        return "bb";
    }


    /*
    1, 2, 3, 4, 5, 6
    1, 1, 2, 3, 5, 8, ......
     */

    public static int fib(int n) {
        int[] f= new int[n + 1];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i >= 2 && i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }
    c2039864@newcastle.ac.uk

    // ssss
    public static void main(String[] args) {
        /*
for(int i = 0; i < 10; i++) {
System.out.println(days[i]);
}

         */


        System.out.println(fib());

    }
}
