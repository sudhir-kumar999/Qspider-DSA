public class Check_sorted {
    public static void main(String[] args) {
        int[] arr={1,2,5,40,200,300,1000};
        boolean isSorted=true;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    isSorted=false;
                    break;
                }

            }
            
        }
        System.out.println(isSorted);
    }
}
