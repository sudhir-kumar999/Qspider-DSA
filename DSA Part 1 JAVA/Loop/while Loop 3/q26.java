public class q26 {
    public static void main(String[] args) {
        int n=42065;
        while(n>0){
            int rem = n%10;
            int fact=1;
            int i =1;
            while(i<=rem){
            fact*=i;
            i++;
            }
            System.out.println(fact+" ");
            n/=10;
        }
    }
    
}
