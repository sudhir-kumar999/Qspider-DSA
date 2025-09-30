//package Practice_Question;

public class Missing_in_arr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8,9};
        boolean isFound = false;
        for( int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]-1){
                 isFound=true;
               // System.out.println(arr[i]+" is present");
                
            }
            else{
                isFound=false;
                System.out.println(arr[i]+1 +" not present");
                break;
                
            }
        }
       
    
        if(isFound==true){
            System.out.println("Element is not missing");
        } else{
            System.out.println("element is missing");
        }
    }
    
}
