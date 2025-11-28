import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        System.out.println("Enter a number to check prime or not");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;
        for(int i=2;i<=num;i++){
            if(num%i==0){
                isPrime=false;
                break;
            }
            
        
        
        if(isPrime){
            System.out.println("prime"+num);
        }
        }

        

    }

}
