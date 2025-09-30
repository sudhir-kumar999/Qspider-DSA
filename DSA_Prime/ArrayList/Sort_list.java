import java.util.ArrayList;
import java.util.Collections;

public class Sort_list {
    
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();

        list1.add("sudhir");
        list1.add("kumar");
        list1.add("hajipur");
        list1.add("vaishali");

        Collections.sort(list1);
        System.out.println(list1);
    }
}
