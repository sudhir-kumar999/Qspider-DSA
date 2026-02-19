
public class q7 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int[] sum = new int[4];

        sum[0]=arr[0];
        for (int i = 1; i < 4; i++) {
            
            sum[i]=sum[i-1]+arr[i];
        }
        for (int j = 0; j < 4; j++) {
            System.out.println(sum[j]);
        }
    }
}
