//package 1. Interview Questions;

public class Delete_ele {
    public static void main(String[] args) {
        int[] arr ={5,6,4,7,8,9,3,2,1};
        int key =8;

        // skip approach
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==key){
        //         continue;
        //     }else{
        //         System.out.println(arr[i]);
        //     }
        // }



        //2nd approach
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                arr[0]=arr[i];
            } else{
            
            System.out.println(arr[i]);
        }
        

            
        }
        
        
    }
    
}
