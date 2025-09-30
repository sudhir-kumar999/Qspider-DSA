//package ArrayList;

import java.util.ArrayList;

public class Repeat_ele {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(6);
        list.add(6);

        int target = 6;
        int count =0;

        for(Integer num : list){
            if(num==target){
                count++;
            }

        }
        System.out.println(count);
    }
    
}
