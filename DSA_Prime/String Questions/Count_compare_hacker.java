//package String Questions;

import java.util.Arrays;

public class Count_compare_hacker {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "java";

        
        int val = str1.compareTo(str2);
        int length = str1.length() + str2.length();
        System.out.println(length);
        if (val <= 0 ) {
            System.out.println("No");
        }
        
         String substr1 = str1.substring(0,1).toUpperCase();
         String main1 = substr1+ str1.substring(1); 
        String substr2 = str2.substring(0,1).toUpperCase();
        String main2 = substr2+ str2.substring(1); 
        
        
        System.out.println(main1+" "+main2);
        
        
        
    }

}
