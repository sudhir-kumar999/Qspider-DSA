public class Largest_in_arr {
    public static void main(String[] args) {
        int arr[]={1,5,2,3,66,44,55,22,220};
        int largest=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}
