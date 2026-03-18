import java.util.Scanner;

public class Print_Arr {
    public static void main(String[] args) {
        System.out.println("Enter no of element in array");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array is");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    
}
