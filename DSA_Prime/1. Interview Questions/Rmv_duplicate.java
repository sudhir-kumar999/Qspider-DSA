//package 1. Interview Questions;

public class Rmv_duplicate {
    public static void main(String[] args) {
        int[] arr = {2,5,7,8,2,4,5,6};
        
        
        int newindex=0;
        int n= arr.length;
        int[] new_arr = new int[n];
        for(int i=0;i<n;i++){
            boolean isDuplicate = false;
            for(int j=0;j<newindex;j++){
                if(arr[i]==arr[j]){
                
                    isDuplicate=true;
                    break;
                    
                }
            } 
            if(!isDuplicate){
                new_arr[newindex]=arr[i];
            
            newindex++;
            }
        }
        for(int k=0;k<newindex;k++){
            System.out.println(new_arr[k]);
        }
    }
    
}
