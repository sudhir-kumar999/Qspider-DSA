//package String;

import java.util.Scanner;

public class Length_string {
    public static void main(String[] args) {
        System.out.println("Enter your full name");
        Scanner sc = new Scanner(System.in);
        String fullname = sc.nextLine();
        int count=0;
        for(int i=0;i<fullname.length();i++){
            count++;
            System.out.println(fullname.charAt(i));
        }
        System.out.println(count);
    }
    
}
