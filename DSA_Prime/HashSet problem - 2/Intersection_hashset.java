//package HashSet problem - 2;

import java.util.HashSet;

public class Intersection_hashset {
    public static void main(String[] args) {
        String str = "my name is sudhir";
        String str2 = "my name is kumar";

        HashSet<String> set1 = new HashSet<>();
        String[] arr1 = str.split(" ");

        HashSet<String> set2 = new HashSet<>();
        String[] arr2 = str2.split(" ");
        
        for(String word : arr1){
        //System.out.println(word);
        set1.add(word);
        }
        for(String word : arr2){
        //System.out.println(word);
        set2.add(word);
        }

        set1.retainAll(set2);
        System.out.println(set1);

        System.out.println(String.join(" ",set1));
    }
    

}
