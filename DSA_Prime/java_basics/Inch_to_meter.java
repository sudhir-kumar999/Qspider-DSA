import java.util.Scanner;

public class Inch_to_meter {
    public static void main(String[] args) {
        double cm = 2.5;
        System.out.println("Enter value to convert inch into meter");
        Scanner input = new Scanner(System.in);
        double inch = input.nextDouble();
        double meter = (inch*cm)/100;
        System.out.println("The meter of " + inch + " inch is " + meter+"m");
    }
    
}
