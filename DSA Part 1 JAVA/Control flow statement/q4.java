import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        // take char input and print it is lower or upper case or other character
        System.out.println("Enter a character to check");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char ch = input.charAt(0);
        if (ch >= 'A' && ch <= 'A') {
            System.out.println("Entered character is of UpperCase");
        } else if(ch>='a' && ch<='z'){
            System.out.println("Entered character is of LowerCase");

        }
        else{
            System.out.println("it is other character than alphabet");
        }
    }

}
