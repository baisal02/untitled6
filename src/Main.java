import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();
        a.add(2);
        a.add(1);
        a.add(4);
        a.add(5);

        HashSet<Integer> b = new HashSet<>();
        b.add(2);
        b.add(4);
        b.add(6);
        b.add(8);
        b.add(1);

        HashSet<Integer> newsettt = symmmetricalDifference(a, b);
        System.out.println(newsettt);
    }

    public static HashSet<Integer> symmmetricalDifference(HashSet<Integer> a, HashSet<Integer> b) {
        HashSet<Integer> newset = new HashSet<>();
        for (int i :
                a) {
            if (!b.contains(i)) {
                newset.add(i);
            }
        }
        for (int i :
                b) {
            if (!a.contains(i)) {
                newset.add(i);
            }
        }
        return newset;
    }
}