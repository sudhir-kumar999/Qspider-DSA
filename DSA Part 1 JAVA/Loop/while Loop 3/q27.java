public class q27 {
    public static void main(String[] args) {
        int n=42065;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            int fact=1;
            int i =1;
            while(i<=rem){
            fact*=i;
            
            i++;
            }
            sum+=fact;
            
            n/=10;
        }
        System.out.println(sum+" ");
    }
    
}
