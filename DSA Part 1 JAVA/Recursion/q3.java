import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        System.out.println("Enter a number to print its table");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i=1;
        table(x, i);

    }

    public static void table(int n ,int i){
        if(i==11){
        return;
        }
        System.out.println(n+"*"+i +"="+n*i);
        table(n,i+1);
    }
    
}
