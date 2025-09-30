import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        // take input to check is it upper lower case or digit or special character
        System.out.println("Enter a character to check");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char ch = input.charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("character is of upper case");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("character is of lower case");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("character is a digit");
        } else {
            System.out.println("character is special character");
        }
    }
}
