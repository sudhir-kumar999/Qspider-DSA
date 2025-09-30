import java.util.Scanner;

public class Compare_abc {
    public static void main(String[] args) {
        System.out.println("Enter value of a,b,c");
        Scanner input = new Scanner(System.in);
        int a= input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a +" a is greater");
            } else{
                System.out.println(c +" c is greater");
            }
        } else{
            if (b>c) {
                System.out.println(b + " b is greater");
                
            }

        }

    }
    
}
