import java.util.Scanner;

public class Delete_2_ele {

    public static void Search(int[] arr , int num , int n){
        int index=-1;
        boolean found = false;
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                System.out.println("element is found at index "+i);
                index=i;
                found=true;
                break;
            }
            
        }
        if(!found){
                System.out.println("element is not found");
            }else{

            for(int i=index;i<n;i++){
                arr[i]=arr[i+1];
            }
        
        System.out.println("Element is deleted and updated array is");

            for(int i=0;i<n-1;i++){
                System.out.println(arr[i]);
            }
        }

    }
    public static void main(String[] args) {
        System.out.println("enter no of element");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr = new int[100];
        System.out.println("Enter array element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element to search");
        int num= sc.nextInt();

        Search(arr ,num,n);
    }
    
}
