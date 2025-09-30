//package 1. Interview Questions;

public class Shift_by_1 {
    public static void main(String[] args) {
        String str = "sudhir";
        char[] ch = str.toCharArray();
        System.out.println("your string is "+str);
        System.out.println("new string is ");
        for (int i = 0; i < ch.length; i++) {
            int ascii = ch[i]+1;
            char next_ch= (char) ascii;
            System.out.print(next_ch);
        }
    }

}
