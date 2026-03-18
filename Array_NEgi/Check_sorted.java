
public class Check_sorted {
    public static void main(String[] args) {
        // int arr[]={1,2,5,4,7,89,3,2,40};
        int arr[]={1,2,3,4,5,6,7,8,9};
        boolean isSorted=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("sorted");
        }else{
            System.out.println("not sorted");
        }
    }
}
