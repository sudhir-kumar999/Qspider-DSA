import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        System.out.println("Enter any check it is Leap yr or not");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if(year%4==0){
            System.out.println(year + " year is Leap year");
        } else{
            System.out.println(year + " year is not Leap year");
        }
    }
    
}
