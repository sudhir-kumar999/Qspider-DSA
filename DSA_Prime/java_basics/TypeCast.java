import java.util.Scanner;

public class TypeCast {
    public static void main(String[] args) {
        System.out.println("Enter a number to convert");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double x  = n;
        System.out.println(x);
        
        int y = (int) x;
        System.out.println(y);
        
    }
}
