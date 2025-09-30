import java.util.ArrayList;

public class Pos_neg {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 8, 4, -7, -9, -6, -3, 5, 8, -2, -3 ,-8,-7};

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                list.add(arr[i]);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                list.add(arr[i]);
            }
        }

        System.out.println(list);
        // for(Integer num:list){
        // System.out.println(num);
        // if(num>0){

        // }
        // }

        int i = 0;
        int j = list.size()-1;
        while (i < j) {
            System.out.println(list.get(i));
            i++;
            System.out.println(list.get(j));
            j--;
        }
    }

}
