import java.util.Arrays;

public class Sec_large_small {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 4, 7, 8, 9, 6, 3, 2, 1, 5, 8, 7 };

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            int large = arr[arr.length];
            System.out.println(large); 
        }
    }

}
