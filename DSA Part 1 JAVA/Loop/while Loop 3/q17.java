
public class q17 {
    public static void main(String[] args) {
        int n = 4207063;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            if(rem%2!=0){
            sum+=rem;
            }
            n/=10;
        }
        System.out.println(sum);
    }
    
}

