//package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array_lis_define {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        System.out.println(list);

        // to get element with index
        int element = list.get(0);
        // System.out.println(element);

        // to add element in between
        // index element
        list.add(1, 10);
        System.out.println(list);

        // set element to replace element
        list.set(0, 1);
        System.out.println(list);

        // delete element
        list.remove(3);
        System.out.println(list);

        // size of arraylist
        int size = list.size();
        System.out.println(size);

        // loops in arraylist for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // to sort the list
        Collections.sort(list);
        System.out.println(list);

        //to check element contains or not
        int target=88;
        if(list.contains(target)){
            System.out.println("element found");
        } else{
            System.out.println("element not found");
        }

        list.toArray();
        System.out.println(list);


        // to find the sublist
        List <Integer>sub = list.subList(2, 4);
        System.out.println(sub);

        //to compare two list
        //System.out.println("list1.equals(list2): " + list1.equals(list2)); // true
    }

}