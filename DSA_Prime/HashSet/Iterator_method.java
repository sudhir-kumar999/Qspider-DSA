//package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Iterator_method {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);

        System.out.println(set);
        Iterator <Integer> itr = set.iterator();
        while(itr.hasNext()){
            int element = itr.next();
            System.out.println(element);
        }

    

    }

}
