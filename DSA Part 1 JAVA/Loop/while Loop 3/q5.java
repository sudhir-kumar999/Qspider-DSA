
public class q5 {
    public static void main(String[] args) {
        int n=43705;
        int big=0;
        while(n>0){
            int rem = n%10;
            if(rem>big){
                big=rem;
            
            }
            n/=10;
        }
        System.out.println("largest number is "+big);
        
    }
    
}
