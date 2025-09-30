import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        //  check leap year or not
        System.out.println("Enter a year to check leap or not");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if(input%4==0){
            System.out.println("leap year");
        } else{
            System.out.println("not leap year");
        }
    }
    
}
