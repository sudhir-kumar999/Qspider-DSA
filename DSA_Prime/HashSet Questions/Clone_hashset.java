//package HashSet Questions;

import java.util.HashSet;

public class Clone_hashset {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("sudhir");
        set.add("kumar");
        set.add("hajipur");

        HashSet<String> cloneset = (HashSet<String>) set.clone();
        // System.out.println(cloneset);

        // for(String word : cloneset){
        //     System.out.println(word);
        // }
    }
    
}
