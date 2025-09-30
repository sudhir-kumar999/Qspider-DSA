import java.util.Scanner;

public class Check_palindrome {

    public static void main(String[] args) {
        System.out.println("Enter size of array");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[100];
        if(n<3){
            System.out.println("Enter at least 3 element to check palindrome");
            return ;
        }
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int left=0;
        int right= n-1;
        boolean found =false;

        while(left<right){
            if(arr[left]==arr[right]){
                left++;
                right--;
                found=true;
                //System.out.println("Enter element is palindrome");

            } else{
                found=false;
                break;
            }
        }
        if(found==true){
            System.out.println("Enter element is palindrome");
        } else{
             System.out.println("Enter element is not palindrome");
        }
    }
    
}
