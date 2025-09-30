
public class q15 {
    public static void main(String[] args) {
        int n = 4207065;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum+=rem;
            n/=10;
        }
        System.out.println(sum);
    }
    
}

