import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        // int[] arr1 = {5,6,8,7,1};
        // int[] arr2={1,2,6,5,4};

        System.out.println("enter no of array");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        System.out.println("Enter array  elements ");
        int[] arr1= new int[n];
        int arr2[] = new int[n];
        System.out.println("enter first array element");
        for(int i=0;i<n;i++){
            
            arr1[i] = sc.nextInt();
        }

        System.out.println("enter second array element");
        for(int i=0;i<n;i++){
            
            arr2[i] = sc.nextInt();
        }
        
            int temp[] =arr1;
            arr1=arr2;
            arr2=temp;
        System.out.print("arr1 : ");
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]);

        }
        System.out.println();
        System.out.print("arr2 : ");
        for(int i=0;i<n;i++){
            System.out.print(arr2[i]);
            
        }
    }
    
}
