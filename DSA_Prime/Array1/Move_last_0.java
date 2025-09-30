public class Move_last_0 {
    public static void main(String[] args) {
        int[] arr= {1,0,2,0,1,4,0,6};

        for(int i=0;i<8;i++){
            if(arr[i]!=0){
                System.out.println(arr[i]);
               
            }
        }
        for(int i=7;i>=0;i--){
            if(arr[i]==0){
                    System.out.println(arr[i]);
                }
        }
    }
    
}
