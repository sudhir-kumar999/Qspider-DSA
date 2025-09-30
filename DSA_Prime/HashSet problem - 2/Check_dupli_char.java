//package HashSet problem - 2;

import java.util.HashSet;

public class Check_dupli_char {
    public static void main(String[] args) {
        String str = "programming";
        char[] ch = str.toCharArray();

        HashSet<Character> set= new HashSet<>();

        for(int i=0;i<str.length();i++){
           // System.out.println(ch[i]);
           if(set.contains(ch[i])){
            System.out.println("not unique");
            break;
           } else{
            set.add(ch[i]);
           }
        }
        System.out.println(set);
    }
    
}
