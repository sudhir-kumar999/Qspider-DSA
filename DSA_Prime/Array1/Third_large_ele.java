import java.util.Scanner;

public class Third_large_ele {

    public static void main(String[] args) {
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[100];
        System.out.println("Enter array element ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>first){
                second=first;
                third=second;
                arr[i]=first;
            } else if(arr[i]<first && arr[i]>second){
                third=second;
                arr[i]=second;

            } else if(arr[i]<second && arr[i]>third){
                arr[i]=third;

            }
        }
        System.out.println("");
    }
    
}
