import java.util.Scanner;

public class Alphabet_tri {
    public static void main(String[] args) {
        System.out.println("Enter no of rows");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

        for(int i=0;i<x;i++){
            char ch='A';
            for(int j=0;j<=i;j++){
            System.out.print(ch+" ");
                ch++; 
            }
            System.out.println();
        }
    }
}
