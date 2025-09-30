//package Practice_Question;

public class Find_small_and_repeat_check {
    public static void main(String[] args) {
        int[] arr={8 ,5,4,8,7,5,6,5,8,5,5,1,5,5};
        int smallest=arr[0];
        
        for(int i=1;i<arr.length;i++){
            
            if(arr[0]>arr[i]){
                smallest=arr[i];
                System.out.println(smallest);
                break;
                
            } else{
                smallest=arr[0];
                System.out.println(arr[0]);
                break;
            }
            
        }
        int count=0;
         for(int i=0;i<arr.length;i++){
            if(smallest==arr[i]){
                count++;
                
            }
        }
        System.out.println(count);
       
    }

}
