import java.util.Scanner;

public class Swap_3rd_var {
    public static void main(String[] args) {
        System.out.println("Enter two number to Swap");
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c= a;
        a=b;
        b=c;
        System.out.println("After swap value of a is "+a +" value of b is "+b);

    }
    
}
