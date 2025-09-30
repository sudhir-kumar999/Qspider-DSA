//package HashSet problem - 2;

import java.util.HashSet;

public class Duplicate_from_String {
    public static void main(String[] args) {
        String str = "programming";
        HashSet<Character> set = new HashSet<>();
        char[] ch = str.toCharArray();
        for(int i=0;i<str.length();i++){
            //System.out.println(ch[i]);
            if(set.contains(ch[i])){
                
                System.out.println("Duplicate is" + ch[i]);
                continue;
            } else{
            set.add(ch[i]);
            }
        }
        System.out.println(set);
    }
    
}
