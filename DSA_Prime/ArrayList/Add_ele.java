//package ArrayList;

public class Add_ele {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,6,9};

        for(int i=0;i<arr.length;i++){
            if(i==4){
                arr[i]=8;
            }
            System.out.println(arr[i]);
        }
    }
    
}
