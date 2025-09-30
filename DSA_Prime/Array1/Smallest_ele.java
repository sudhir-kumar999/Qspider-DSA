import java.util.Scanner;

public class Smallest_ele {

    public static void main(String[] args) {
        System.out.println("Enter size of array");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[100];
        System.out.println("Enter array element");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int smallest=arr[0];
        int index=0;
        for(int i=1;i<n;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
                index=i;
                

            }

        }
        System.out.println("Element is found at index "+ index);
        System.out.println("Smallest Element is "+smallest);
    }
    
}
