
public class Lagest_in_arr {
    public static void main(String[] args) {
        int[] arr={1,5,6,300,2,48};
        int largest=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
    
}
