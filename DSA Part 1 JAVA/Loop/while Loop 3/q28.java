public class q28 {
    public static void main(String[] args) {
        int n=145;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            int fact = 1;
            int i=1;
            while(i<=rem){
                fact*=i;
                i++;
            }
            sum+=fact;
            n/=10;
        }
        if(n==sum){
            System.out.println( " it is a strong number");
        } else{
            System.out.println("it is not a strong number");
        }
    }
    
}
