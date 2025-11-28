
public class q5 {
    public static void main(String[] args) {
        int sum =0;
        int res =sqsum(1, sum);
        System.out.println(res);
    }

    public static int sqsum(int n , int sum){
        if(n>100){
            return sum;
        }
        sum+=n*n;
        return sqsum(n+1, sum);
    }
    
}
