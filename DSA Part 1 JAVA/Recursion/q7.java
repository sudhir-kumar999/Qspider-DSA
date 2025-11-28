
public class q7 {
    public static void main(String[] args) {
        int fact = 1;
        int res = factorial(5 , fact);
        System.out.println(res);
    }

    public static int factorial(int n , int fact){
        if(n<=1){
            return fact;
        }
        fact*=n;
        return factorial(n-1, fact);
    }
    
}
