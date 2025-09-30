//package HashSet Questions;

import java.util.HashSet;

public class Rmv_common_ele_set2 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);

        HashSet<Integer> set1 = new HashSet<>();
        set.add(5);
        set.add(2);
        set.add(7);
        set.add(3);
        set.add(9);
        

        set.removeAll(set1);
        System.out.println(set);
    }
    
}
