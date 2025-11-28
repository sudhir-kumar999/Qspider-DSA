// package DSA Part 1 JAVA.Recursion;

public class q2 {
    public static void main(String[] args) {
        int x=10;
        printnum(x);
    }

    public static void printnum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printnum(n-1);
    }
    
}
