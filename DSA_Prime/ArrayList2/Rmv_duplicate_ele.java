//package ArrayList2;

import java.util.ArrayList;

public class Rmv_duplicate_ele {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(6);
        list.add(8);

        for (int i = 0; i <= list.size(); i++) {
            if (list.contains(list.get(i))) {
                list.remove(i);
            }
            // System.out.println(list);
        }
        // System.out.println(list);
    }

}
