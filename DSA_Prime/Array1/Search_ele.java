import java.util.Scanner;

public class Search_ele {
    public static void main(String[] args) {
        System.out.println("Enter array elements");
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number to search");
        int num = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i]);
            if (num == arr[i]) {
                System.out.println("element is found at index " + i);
                found = true;
                break;

            }
        }
            if(!found){
                System.out.println("Element is not found");
            }
        }
    

}
