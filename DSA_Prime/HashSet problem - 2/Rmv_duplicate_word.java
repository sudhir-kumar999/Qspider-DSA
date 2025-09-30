//package HashSet problem - 2;

import java.util.HashSet;

public class Rmv_duplicate_word {
    public static void main(String[] args) {
        String str = "my name is my name";
        String[] split = str.split(" ");
        // for(String word : split){
        // System.out.println(word);
        // }
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
            set.add(split[i]);
        }
        System.out.println(set);
        

    }

}
