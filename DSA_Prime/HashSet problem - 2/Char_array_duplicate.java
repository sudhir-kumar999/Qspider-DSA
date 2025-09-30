//package HashSet problem - 2;

import java.util.HashSet;

public class Char_array_duplicate {
    
    public static void main(String[] args) {
        String str= "programming";

        char[] ch = str.toCharArray();

        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
            set.add(ch[i]);
        }
        System.out.println(set.size());
        System.out.println(set);
    }
}
