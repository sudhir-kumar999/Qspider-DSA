public class BinaryToDecimal {
    public static void main(String[] args) {
        int res = decimal(10000);
        System.out.println(res);
    }

    public static int decimal(int x){
        int decimalno=0;
        int place =1;
        while(x>0){
            int rem = x%10;
            decimalno = decimalno+rem*place;
            place*=2;
            x/=10;
        }
        return decimalno;
    }
    
}
