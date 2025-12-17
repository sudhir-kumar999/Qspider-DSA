public class q10 {
    public static void main(String[] args) {
        int num = 32546;
        int sum =0;
        int res = digit(num, sum);
        System.out.println(res);
    }

    public static int digit(int num , int sum){
        if(num<9){
            return num;
        }
        return (num%10)+digit(num/10,sum);
    }
    
}
