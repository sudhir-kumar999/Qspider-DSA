import java.util.Scanner;

public class q22 {
    public static void main(String[] args) {
        System.out.println("Enter a number to check");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<n){
            if(n%i==0){
                sum+=i;
            }
            i++;
        }
        if(sum==n){
            System.out.println("n is a perfect number");
        } else{
            System.out.println("n is not perfect number");
        }
    }
    
}
