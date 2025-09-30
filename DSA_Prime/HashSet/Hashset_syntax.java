//package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_syntax {

    
    public static void main(String[] args) {
        //Syntax or create hashSet
        HashSet<Integer> set = new HashSet<>();

        // to insert elements
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //print all elements of set
        System.out.println(set);
        // to search elements
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("set does not contains 6");
        }

        // to delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("it does not contains 1");
        }

        // print size 
        System.out.println("size of set is "+set.size());
    
    // for iterating in java

    Iterator it = set.iterator();
    // it has two function hasNext() , next

    while(it.hasNext()){
        System.out.println(it.next());
    }
    }
    
}
