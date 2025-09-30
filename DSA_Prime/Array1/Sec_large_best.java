import java.util.Scanner;

public class Sec_large_best {
    public static void main(String[] args) {
        System.out.println("Enter no of element");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<2){
            System.out.println("Enter at least 2 element to find");
            return;
        }
        System.out.println("Enter array element ");
        int[] arr = new int[100];
        
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] < first && arr[i] > second) {
                second = arr[i];
            }
        }
        System.out.println("First Largest element is " + first);

        if (second == Integer.MIN_VALUE) {
            System.out.println("Second Largest does not exist (all values may be same)");
        } else {
            System.out.println("Second Largest element is: " + second);
        }
    }

}
