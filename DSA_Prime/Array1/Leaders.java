import java.util.Scanner;

public class Leaders {

    public static void main(String[] args) {
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[100];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
         System.out.println("Leaders elements are");
// first approach
        // int i=0;
        // while(i<n){
        //     if(arr[i]>arr[i+1]){
               
        //         for(int j=0;j<n;j++){
        //         System.out.println(arr[i]);
        //         break;
        //         }
                
        //     }
        //     i++;
        // }
            
        //second approach

        // for(int i=0;i<n;i++){
        //     int curr=arr[i];
        //     boolean isLeader=true;
        //     for(int j=0;j<n;j++){
        //         if(arr[j]>curr){
        //             isLeader=false;
        //         }
        //     }
        //     if(isLeader){
        //         System.out.println(arr[i]);
        //     }
        // }

        // 3rd approach
        int[] maxx = new int[n];
        int max= Integer.MIN_VALUE;
        int j=0;
        for(int i=n-1;i>0;i--){
            if(arr[i]>max){
                max=arr[i];
                //System.out.println(max);
                maxx[j++]=arr[i];
            }
            
        }
        for( j=j-1;j>=0;j--){
            System.out.println(maxx[j]+" ");
        }
        
    }
    
}
