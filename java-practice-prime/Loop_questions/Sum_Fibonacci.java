public class Sum_Fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=5;
        int c=0;
        int sum=a+b;
        for(int i=3;i<=n;i++){
            c=a+b;
            sum+=c;
            a=b;
            b=c;
        }
        System.out.println(sum);
    }
    
}
