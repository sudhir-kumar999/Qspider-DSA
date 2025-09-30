//package HashSet problem - 2;

import java.util.HashSet;

public class Two_arr_contain_ele {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 ={1,2,3,4,5,5,6};
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2= new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            set1.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            set2.add(arr2[j]);
        }
       if( set1.equals(set2)){
        System.out.println("elements are same");
       } else{
        System.out.println("elements are not same");
       }
    }
    
}
