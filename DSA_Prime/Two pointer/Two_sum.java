import java.util.Scanner;

public class Two_sum {
    public static void main(String[] args) {
        System.out.println("Enter size of array");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[100];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target to find index");
        int target=sc.nextInt();

        int left=0;
        int right=n-1;

        while(left<right){
            if(arr[left]+arr[right]==target){
                System.out.println(left+" "+right);
                left++;
                right--;
            
        }else if(arr[left]+arr[right]<target){
            left++;
        } else{
            right--;
        }
    }
    
    
    }
}
