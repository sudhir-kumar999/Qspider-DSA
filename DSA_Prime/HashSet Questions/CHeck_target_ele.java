//package HashSet Questions;

import java.util.HashSet;
import java.util.Iterator;

public class CHeck_target_ele {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        int target = 9;

        boolean found = false;
        Iterator <Integer> itr=set.iterator();
        while(itr.hasNext()){
            //use .equals instead of ==
            if(itr.next().equals(target)){
            found=true;
            break;
            }
        }
        if(found==true){
                System.out.println("element is present");
            } else{
                System.out.println("element is not present");
            }
        }
    
    
}
