//package HashSet problem 3;
// ✅ 1. Find Missing Numbers in a Range

import java.util.HashSet;

public class Missing_no_in_set {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        int n=10;
        for(int i=1;i<n;i++){
            if(!set.contains(i)){
                System.out.println(i);
            }
        }

    }
    
}
