import java.util.Scanner;

public class Remove_duplicate {

    public static void main(String[] args) {
        System.out.println("Enter size of array ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[100];
        System.out.println("Enter array Element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = 1;
        System.out.println("Unique array is ");
        while (right < n) {
            if (arr[right] != arr[left]) {
                left++;
                arr[left] = arr[right];
            } else {
                right++;
            }
        }
        for (int k = 0; k <= left; k++) {
            System.out.println(arr[k]);
        }
    }
