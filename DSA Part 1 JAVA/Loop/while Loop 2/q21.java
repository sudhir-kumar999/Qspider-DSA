import java.util.Scanner;

public class q21 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        int sum=0;
        while(i<n){
            if(n%i==0){
                sum+=i;
                
            }
            i++;
        }
            System.out.println("sum of factor of n is "+sum);

    }
}
