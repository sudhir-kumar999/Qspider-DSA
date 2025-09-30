//package HashSet problem - 2;

import java.util.HashSet;

public class Duplicate_from_array {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,3,5,6,8,9,5,5};

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                System.out.println("first duplicate element is " +arr[i]);
                //break;
                continue;
            } else{
                
                set.add(arr[i]);
            }
        }
        System.out.println(set);
    }
    
}
