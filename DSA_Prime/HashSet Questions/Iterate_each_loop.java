//package HashSet Questions;

import java.util.HashSet;

public class Iterate_each_loop {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);

        for(Integer num : set){
            System.out.println(num);
        }
    }
    
}
