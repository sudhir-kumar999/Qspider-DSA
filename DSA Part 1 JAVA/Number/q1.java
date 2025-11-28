import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        System.out.println("Enter a number to check prime or not");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        int count = 0;
        while (i<=num) {
            if (num % i == 0) {
                count++;
                if(count>2){
                    break;
                }
                
            }
            i++;
        }
        if (count == 2) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }

}
