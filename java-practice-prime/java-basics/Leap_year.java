import java.util.Scanner;

public class Leap_year {

    public static boolean year(int yrs){
        if(yrs%4==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("enter a year to check it is leap or not ");
        Scanner sc=new Scanner((System.in));
        int yrs=sc.nextInt();
        boolean res=year(yrs);
        if(res==true){
            System.out.println("leap year");
        }else{
            System.out.println("not a leap year");
        }
    }
    
}
