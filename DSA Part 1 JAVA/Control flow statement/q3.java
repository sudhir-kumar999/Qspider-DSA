import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        // take a character input or print it is alphabet or not
        System.out.println("Enter a character to it is alphabet or not");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char ch = input.charAt(0);
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("your entered character is alphabet");
        } else {
            System.out.println("your entered character is not alphabet");

        }

    }

}
