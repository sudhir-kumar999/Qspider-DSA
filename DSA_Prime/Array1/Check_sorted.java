import java.util.Scanner;

public class Check_sorted {

    public static void main(String[] args) {
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[100];
        System.out.println("Enter array Element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean sorted=false;

        for(int i=0;i<n;i++){
            if(arr[i]<arr[i+1]){
                sorted=true;
            }
           
        }
         if (sorted==true){
            System.out.println("Element is sorted");
            }
            else{
                System.out.println("Element is not sorted");
            }
    }
    
}
