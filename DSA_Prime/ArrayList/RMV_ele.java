//package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class RMV_ele {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(8);
        list.add(6);

        list.remove(4);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

}
