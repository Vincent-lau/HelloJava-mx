import jdk.jshell.spi.ExecutionControl;

import java.util.List;

public class OODemo {

    static class A {

        int a;
        Integer i;


    }

    // abcd -----> ad
    public static String fl(String s) {
        String f = s.substring(0, 1);
        String x = s.substring(s.length() - 1);
        String y = f + x;
        return y;
    }

    public static boolean calculate(int x, int y) {
            return false;


    }

    // "abcd"    -----> ['a', 'b', 'c', 'd']
    public static List<Character> toArray(String s) {


    }

    public static void main(String[] args) {
        String s = "abceeeeeeeeeeed";
        String t = fl(s);
        int x = 10;
        int y = 11;
        boolean z = calculate(10, 11);
        System.out.println(t);


    }


}
