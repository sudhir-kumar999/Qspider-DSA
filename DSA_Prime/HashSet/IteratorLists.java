import java.util.HashSet;
import java.util.Iterator;

public class IteratorLists {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);

        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}
