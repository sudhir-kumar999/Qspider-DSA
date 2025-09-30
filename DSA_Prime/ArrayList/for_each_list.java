//package ArrayList;

import java.util.ArrayList;

public class for_each_list {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("sudhir");
        list.add("kumar");
        list.add("Hajipur");
        list.add("vaishali");

        for(String word : list){
            System.out.println(word);
        }
    }
    
}
