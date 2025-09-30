import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        // to check profit or loss percent
        System.out.println("Enter the value of cp and sp");
        Scanner sc = new Scanner(System.in);
        double cp = sc.nextInt();
        double sp = sc.nextInt();
        double profit = sp - cp;
        double loss = cp - sp;
        double proPer = (profit * 100) / cp;
        double lossPer = (loss * 100) / cp;
        if(profit>0){
            System.out.println("Profit percent is "+ proPer+"%");
        }else{
        System.out.println("Loss percent is "+lossPer+"%");
        }
    }

}
