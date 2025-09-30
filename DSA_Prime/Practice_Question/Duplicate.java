public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,9,6,7,4};

        
        for(int i=0;i<arr.length;i++){
            boolean found = true;
            for(int j=1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    found = false;
                    continue;

                }
            }
            if(found==true){
            System.out.println(arr[i]);
        }
        }
        
    }
    
}
