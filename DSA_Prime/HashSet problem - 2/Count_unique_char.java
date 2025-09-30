//package HashSet problem - 2;

import java.util.HashSet;

public class Count_unique_char {
    public static void main(String[] args) {
        String str="abhimanyu";
        HashSet<Character> set = new HashSet<>();
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            //System.out.println(ch);
            set.add(ch);

        }
        System.out.println(set.size());
    }
    
}
