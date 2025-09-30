import java.util.Scanner;

public class Largest_ele {
    public static void main(String[] args) {
        System.out.println("Enter no of array element");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("enter array elements");
        int[] arr= new int[100];
        int largest=arr[0];
        int index=-1;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
                index=i;
                
            }
        }
        System.out.println("Element is found at index "+index);
        System.out.println("the largest element is "+largest);
    }
    
}
