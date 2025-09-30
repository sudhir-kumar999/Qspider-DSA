//package ArrayList;

import java.util.ArrayList;

public class Replace_ele {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        list.set(2, 100);
        System.out.println(list);
    }
    
}
