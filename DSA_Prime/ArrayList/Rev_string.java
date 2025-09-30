//package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Rev_string {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("mango");

        // for(int i=list.size()-1;i>=0;i--){
        //     System.out.println(list.get(i));
        // }

        //using inbuilt function
        Collections.reverse(list);
        System.out.println(list);
        
    }
    
}
