//package HashSet Questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class To_array {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);

        Object[] arr = set.toArray();

        System.out.println(Arrays.toString(arr));

        System.out.println(arr);
    }
}
