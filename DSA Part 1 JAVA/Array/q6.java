
public class q6 {
    public static void main(String[] args) {
        int arr[] = {2,5,4,3,6};
        int sum = 0;
        for(int i=0;i<5;i++){
            sum+=arr[i];
        }
        int arr2[] = new int[5];
        for(int j=0;j<5;j++){
            arr2[j] = sum-arr[j];
        }

        System.out.println("array is :");
    for(int k=0;k<5;k++){
        System.out.print(arr2[k] + " ");
    }
    }
}
