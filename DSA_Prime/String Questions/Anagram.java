//package String Questions;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "sudhir";
        String str2 = "dhirsu"; 

        char[] arr1= str1.toCharArray();
        Arrays.sort(arr1);
        for(char word:arr1){
            System.out.println(word);
        }

        char[] arr2= str2.toCharArray();
        Arrays.sort(arr2);
        for(char word:arr2){
            System.out.println(word);
        }
        if(Arrays.equals(arr1,arr2)){
            System.out.println("string is same");
        } else{
            System.out.println("Not same");
        }
        
    }
    
}
