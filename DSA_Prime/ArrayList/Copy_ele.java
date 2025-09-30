//package ArrayList;

import java.util.ArrayList;

public class Copy_ele {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        ArrayList<Integer> copy=(ArrayList<Integer>)list.clone();
        System.out.println(list);
        System.out.println(copy);
    }
    
}
