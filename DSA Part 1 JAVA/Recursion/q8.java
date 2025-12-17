import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        
        System.out.println("Enter number to find power");
        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        // System.out.println("Enter power to calculate");
        // int y = sc.nextInt();
        int res = power( 2 , 5);
        System.out.println(res);

    }
    public static int power(int x , int y){
        if(y<1){
            return 1;
        }
        return  x* power( x , y-1);

    }
    
}
