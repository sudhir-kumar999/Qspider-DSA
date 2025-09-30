// package 1. Interview Questions;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        String ch11= " ";
        String ch22 = " ";

        for(int i=0;i<ch1.length;i++){
            //System.out.println(ch1[i]);
            Arrays.sort(ch1);
            //System.out.println(ch1[i]);
            ch11+=ch1[i];
        }
        for(int j=0;j<ch2.length;j++){
            //System.out.println(ch1[i]);
            Arrays.sort(ch2);
            //System.out.println(ch1[i]);
            ch22+=ch1[j];
        }
        // System.out.println(ch11);
        // System.out.println(ch22);
        if(ch11.equals(ch22)){
            System.out.println("string are anagram");
        } else{
            System.out.println("Both are not anagram");
        }
    }
    
}
