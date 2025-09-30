import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 9, 8, 7, 1, 2, 3, 6, 1, 2, 3 };

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
           // System.out.println(arr[i]);
        }
        int i = 0;
        int j = 1;

        while (j < arr.length) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];

            } else {
                j++;
            }
        }
        System.out.println("element is unique");
        for (int k = 0; k < i; k++) {
            System.out.println(arr[k]);
        }
    }

}
