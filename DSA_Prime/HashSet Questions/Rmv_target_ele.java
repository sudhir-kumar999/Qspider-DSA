//package HashSet Questions;

import java.util.HashSet;
import java.util.Iterator;

public class Rmv_target_ele {
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet<>();
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(80);
        set.add(9);

        int target = 90;
        boolean present= false;

        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            if(itr.next().equals(target)){
                itr.remove();
                present=true;
            } else{
                present=false;
            }
            
            
        }
        if(present==true){
        System.out.println(set);
        } else{
            System.out.println("Target element is not present");
        }
    }
    
}
