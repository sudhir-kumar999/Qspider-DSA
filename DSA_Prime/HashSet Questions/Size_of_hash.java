import java.util.HashSet;
import java.util.Iterator;

public class Size_of_hash {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(3);

        int count = 0;

        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            count++;
            itr.next();
                
            }
            System.out.println(count);
            
        }
        
    }

    

