//package 1. Interview Questions;

import java.util.HashSet;

public class Non_repeat_char {
    public static void main(String[] args) {
        String str = "programming";
        char[] ch = str.toCharArray();

        HashSet<Character> set = new HashSet<>();

        for(int i=0;i<ch.length;i++){
            set.add(ch[i]);
        }

        System.out.println(set);
        System.out.println(set.size());
    }
    
}
