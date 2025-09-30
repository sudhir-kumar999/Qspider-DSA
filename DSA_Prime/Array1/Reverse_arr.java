import java.util.Scanner;

public class Reverse_arr {

    public static void main(String[] args) {
        System.out.println("Enter size of array");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[100];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Reverse of array is ");
        for(int i=n-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    
}
