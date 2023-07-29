import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
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
    // [0, 3) ---> [0, 1, 2]
    public static List<String> toArray(String s) {
        List<String> aabbcc = new ArrayList<>();

        for (int i = 0; i < s.length(); i++ ) {
            String oo = s.substring(i, i+1);
            aabbcc.add(oo);
        }
        return aabbcc;

    }
    
    // n = 3, x = "ab" ----> ["ab", "ab", "ab"]
    public static List<String> filln(int n, String x) {
       return null; 
    }

    // [1, 3, 5, 6] ---> [6, 1, 3, 5]
    public static List<Integer> shuffle(List<Integer> l) {
       return null;


    }

    public static void main(String[] args) {
//        String s = "abceeeeeeeeeeed";
//        String t = fl(s);
//        int x = 10;
//        int y = 11;
//        boolean z = calculate(10, 11);
//        System.out.println(t);
        System.out.println(toArray("abcde"));
    }


}

