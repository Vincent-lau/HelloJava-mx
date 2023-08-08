import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

        for (int i = 0; i < s.length(); i++) {
            String oo = s.substring(i, i + 1);
            aabbcc.add(oo);
        }
        return aabbcc;

    }

    // return max elements in the list
    // [1, 3, 4, 5, 6]
//    public static int findMax(List<Integer> l) {
//       return -1;
//    }

    // n = 3, x = "ab" ----> ["ab", "ab", "ab"]
    // -----2, 3, 4-------> "a b

    // [ 0000011 ]
    // int a = 3; [3]
    // List<Integer> l;  [0x123] -----> [1, 2, 3]
    public static List<String> filln(int n, String x) {
        // XXXX


        List<String> cctt = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            cctt.add(x);
        }
        return cctt;
    }

    // [1, 3, 5, 6] ---> [6, 1, 3, 5]
    public static List<Integer> shuffle(List<Integer> l) {
        int xx = l.get(0);
        for (int i = 0; i < l.size() - 1; i++) {
            l.set(i, l.get(i + 1));
        }
        l.set(l.size() - 1, xx);
        return l;
    }

    public static void main(String[] args) {
//        String s = "abceeeeeeeeeeed";
//        String t = fl(s);
//        int x = 10;
//        int y = 11;
//        boolean z = calculate(10, 11);
//        System.out.println(t);
        System.out.println(findMax(List.of(100, 3, 8, 5, 6)));
    }


    // [100, 3, 8, 5, 6]
    public static int findMax(List<Integer> l) {
        int Maxvalue = l.get(0);
        for (int i = 1; i < l.size(); i++) {
            int Next = l.get(i);
            if (Maxvalue < Next) {
                Maxvalue = Next;
            }

        }
        return Maxvalue;
    }

    public static int findMax2(List<Integer> l) {
        return -1;
        l.remove()

    }

    // ["a", "bb", "cc"] --> {"a": 1, "bb": 2, "cc": 3}
    public static Map<String, Integer> indexMap(List<String> l)  {
        
        return null;

    }

}