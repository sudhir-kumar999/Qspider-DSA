//package HashSet problem 3;

import java.util.HashSet;

public class Unique_wor_para {
    public static void main(String[] args) {
        String parag = "The sun shines and the sun sets";
        String para=parag.toLowerCase();
        String[] split = para.split(" ");
        HashSet<String> set = new HashSet<>();
         for(int i=0;i<split.length;i++){
            //System.out.println(split[i]);
            set.add(split[i]);
         } 
         System.out.println(set);
         System.out.println("Size of unique element is "+set.size());
    }
    
}
