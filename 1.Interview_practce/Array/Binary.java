public class Binary {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int start=arr[0];
        int n=arr.length;
        int target=5;
        int end=arr[n-1];
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                System.out.println("element found at index "+" " +mid);
                return;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
    }
}
