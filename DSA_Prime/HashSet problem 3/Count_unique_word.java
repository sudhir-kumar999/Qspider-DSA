//package HashSet problem 3;

import java.util.HashSet;

public class Count_unique_word {
    public static void main(String[] args) {
        String[] str ={"a.pdf" , "b.txt" , "c.pdf", "d.doc" , "e.mp3" ,"d.mp3"};
        HashSet<String> set = new HashSet<>();
        
        for(int i=0;i<str.length;i++){
            String[] split = str[i].split("\\.");
             
            for(int j=0;j<split.length;j++){
            //System.out.println(split[j]);
            if(split.length>1){
            
            set.add(split[split.length-1]);
            }
            }
        }
        System.out.println(set);
        System.out.println(set.size());
    }
    
}
