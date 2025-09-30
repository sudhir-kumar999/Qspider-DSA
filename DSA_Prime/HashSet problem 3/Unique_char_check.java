//package HashSet problem 3;

import java.util.HashSet;

public class Unique_char_check {
    public static void main(String[] args) {
        String str="secure";
        char[] ch = str.toCharArray();
        HashSet<Character> set = new HashSet<>();
        boolean issecure=true;
        for(int i=0;i<ch.length;i++){
            //System.out.println(ch[i]);
            if(set.contains(ch[i])){
                //System.out.println("Not secure password");
                issecure=false;
                break;
            } else{
                set.add(ch[i]);
            }
        }
        if(issecure){
        System.out.println("your password is secure "+set);
        }else{
            System.out.println("Not secure password");
        }
    }
    
}
