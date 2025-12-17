public class q13 {
    public static void main(String[] args) {
        int res = big(2,4,6,8);
        System.out.println(res);
    }

    public static int big(int a , int b, int c, int d){
        int biggest = a;
        if(biggest>b){
            biggest=b;
        }
        if(c>biggest){
            biggest=c;
        }
        if(d>biggest){
            biggest=d;
        }

        return biggest;

    }
    
}
