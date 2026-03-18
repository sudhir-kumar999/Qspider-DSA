
public class Smallest_in_arr {
    public static void main(String[] args) {
        int[] arr={1,5,4,7,-8,0};
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println(smallest);
    }
}
