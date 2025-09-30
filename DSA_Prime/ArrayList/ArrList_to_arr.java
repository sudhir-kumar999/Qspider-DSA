//package ArrayList;

import java.util.ArrayList;

public class ArrList_to_arr {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        Object[] arr = list.toArray();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
