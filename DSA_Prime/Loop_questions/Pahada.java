//package Loop_questions;

import java.util.Scanner;

public class Pahada {
    public static void main(String[] args) {
        System.out.println("Enter no to write Table");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+ n*i);
        }
    }
    
}
