public class isPrime3 {
    public static void main(String[] args) {
        int kth =46;
        int count =0;
        for(int i=0; ; i++){
            if(checkPrime(i)){
            count++;
            if(count ==kth){
            System.out.println(i);
            break;
            }
        }
        }   
    }

    public static boolean checkPrime(int n) {
        if (n == 1)
            return false;
        else if (n == 2 || n == 3)
            return true;
        else if (n % 2 == 0)
            return false;

        for (int i = 3; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
