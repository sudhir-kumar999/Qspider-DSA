import java.util.ArrayList;
import java.util.HashSet;

public class Pos_negative {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, -6, -9, -5, 4, -2, 6, 9 };

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                list.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                list.add(arr[i]);
        }
        System.out.println(list);
        // System.out.println(list2);

        int k = 0;
        int j = list.size() - 1;
        while (k < j) {
            System.out.println(list.get(k));
            k++;
            System.out.println(list.get(j));
            j--;
        }
    }
}