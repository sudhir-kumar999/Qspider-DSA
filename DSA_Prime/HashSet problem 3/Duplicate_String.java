//package HashSet problem 3;
//Detect Duplicates in Login IDs

import java.util.HashSet;

public class Duplicate_String {
    public static void main(String[] args) {
        String id = "my name is my";
        String[] split = id.split(" ");
        boolean isDupli= false;

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < split.length; i++) {
            // System.out.println(split[i]);
            if (set.contains(split[i])) {
                System.out.println("this string contain duplicate element "+split[i]);
                isDupli=true;
                break;
            } else {
                set.add(split[i]);
                
            }
        }
        if(isDupli){
            System.out.println("duplicate present");
        }else{
        System.out.println(set);
        }

    }

}
