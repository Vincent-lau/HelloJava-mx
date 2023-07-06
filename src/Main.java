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

    public static int f(int x, int y) {
        return 3;
    }

    public static String f(int d, int e) {
        return "be";
    }

    public static String f(char d, int x) {
        return "cc";
    }

    public static String f(int x, int y, int z) {
        return "bb";
    }


    // ssss
    public static void main(String[] args) {
        /*
for(int i = 0; i < 10; i++) {
System.out.println(days[i]);
}

         */

        int a = 3;



        String s = f(2, 1);
        System.out.println(s);

    }
}
