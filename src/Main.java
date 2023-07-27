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

    // and &&                          or ||

   /*
   true and true = true
   true and false

    */



    public static int fib_rec(int n) {
        if (n == 1 || n == 2)
            return 1;
        else
            return fib_rec(n-1) + fib_rec(n-2);

    }


    // 2 ^ n = (2 ^ (n-1)) * 2
    public static int powerOf2(int n) {
        /* p(5) * 2
             p(4) * 2
                   ...
                    p(1) * 2 <- 1 * 2
                    p(0)
         */
       if (n > 0)
           return powerOf2(n -1 ) * 2;
       else
          return 1;

    }

    public static int f(int n) {
        if (n > 3)
            return 3;
        return f(n+1) + 1;
    }

    // main -> f(1) -> f(2) -> f(3) -> f(4)
    /*
    main <- 3
        f(1) <- 5
            -> return f(2) + 1 <- 4
                        -> return f(3) + 1 <- 3
                                   -> return f(4) = 3


     */


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
//    c2039864@newcastle.ac.uk

    // ssss
    public static void main(String[] args) {

        /*
for(int i = 0; i < 10; i++) {
System.out.println(days[i]);
}

         */


        System.out.println(fib(100));

        // 1       1          2        3
        /* fst     sec        next
                    fir        sec


         */
    }

}


