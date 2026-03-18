public class Rmv_duplicate {
    public static void main(String[] args) {
        int[] arr={1,2,6,1,7,9,5,4,7,9};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                System.out.println(arr[j]);
                break;
        
            }
        }
        }
    }
}
