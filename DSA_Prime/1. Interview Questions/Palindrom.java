//package 1. Interview Questions;

public class Palindrom {
    public static void main(String[] args) {
        String str = "sudus";
        String rev = "";

        char[] ch= str.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            System.out.println(ch[i]);
            rev+=ch[i];
        }

        if(str.equals(rev)){
            System.out.println("given string is palindrome");
        } else{
            System.out.println("given string is not palindrome");
        }
    }
    
}
