//package HashSet Questions;

import java.util.HashSet;

public class String_hashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("sudhir");
        set.add("kumar");

        for(String name: set){
            System.out.println(name.toUpperCase());
        }
    }
    
}
