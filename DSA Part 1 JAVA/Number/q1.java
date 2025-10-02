import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        System.out.println("Enter a number to check prime or not");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i=1;
        while(num>0){
            if(num%i==0){
                System.out.println("Number is prime");
            } else{
                System.out.println("Number is not prime");
                break;
            }
            i++;
        }
    }
    
}
