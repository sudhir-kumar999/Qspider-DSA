
public class q2 {
    public static void main(String[] args) {
        int n=43705;
        while(n>0){
            int rem = n%10;
            if(rem%2==0){
            System.out.println(rem);
            }
            n/=10;
        }
        
    }
    
}
