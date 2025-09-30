//package String Questions;

import java.util.Scanner;

public class Rev_each_word {
    public static void main(String[] args) {
        System.out.println("Enter string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //System.out.println(str);
        String  rev="";

        String[] res = str.split(" ");

        for(String word : res){
            for(int i=word.length()-1;i>=0;i--){
               // System.out.println(word.charAt(i));
                rev+=word.charAt(i);
                
            }
            rev+=" ";
            
            
        
        }
        System.out.println(rev);

    }
    
}
