import java.util.Scanner;

public class q20 {
    public static void main(String[] args) {
        System.out.println("Enter 2 number");
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        // int cube = a***b;
        int i=1;
        int total =1;
        while(i<=b){
            total*=a;
            i++;
        }
        System.out.println(total);

    }
    
}
