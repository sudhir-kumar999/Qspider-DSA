//package Rotation Array;

public class Rotate_k_times {
    public static void main(String[] args) {
        int[] arr = {5,6,4,1,2,3,9,8};
        int n=arr.length;
        int k = 3; //index

        k=k%n;
        int[] new_arr = new int[n];

        for(int i=k;i<n;i++){
            System.out.println(arr[i]);
        }

        for(int j=0;j<k;j++){
            System.out.println(arr[j]);
        }
    }
    
}
