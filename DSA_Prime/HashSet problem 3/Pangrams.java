//package HashSet problem 3;

import java.util.HashSet;

public class Pangrams {
    public static void main(String[] args) {
        String alpha ="the quick brown fox jumps over the lazy dog";
        HashSet<Character>set  = new HashSet<>();
        char[] ch=alpha.toCharArray();

        
        

        for(int i=0;i<alpha.length();i++){
            //System.out.println(ch[i]);
            if(ch[i] >='a' && ch[i] <='z'){
                set.add(ch[i]);
            }
            
            
        }
        if(set.size()==26){
            System.out.println("it is pangrams");
        } else{
            System.out.println("Not pangrams");
        }
        
        
    }
    
}
