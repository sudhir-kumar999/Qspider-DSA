//package HashSet Questions;

import java.util.HashSet;
import java.util.Iterator;

public class Check_if_empty {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);

        boolean res = set.isEmpty();
        if (res == true) {
            System.out.println("Hashset is empty");
        } else {
            System.out.println("Hashset is not empty");
        }

    }
}
