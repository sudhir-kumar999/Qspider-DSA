import java.util.Scanner;

public class Swap_No_var {
    public static void main(String[] args) {
        System.out.println("Enter value of a and b to swap");
        Scanner input = new Scanner(System.in);
        int a= input.nextInt();
        int b= input.nextInt();
        a = a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap value of a is "+a +" value of b is "+b);

    }
    
}
