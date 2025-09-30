//package HashSet Questions;

import java.util.HashSet;
import java.util.Iterator;

public class Compare_2_hashset {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        

        // we use retainAll to compare all element and print if common
        set.retainAll(set1);
        System.out.println(set);
        

        }
    }
    

