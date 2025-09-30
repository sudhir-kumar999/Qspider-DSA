//package HashSet Questions;

import java.util.HashSet;

public class Check_Hashset_substring {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);

        HashSet<Integer> set1 =new HashSet<>();
        set1.add(6);
        set1.add(7);
        set1.add(8);
        //set1.add(2);

        if(set.containsAll(set1)){
            System.out.println("Set1 is substring of set");
        } else{
            System.out.println("Not substring of set");
        }
    }
    
}
