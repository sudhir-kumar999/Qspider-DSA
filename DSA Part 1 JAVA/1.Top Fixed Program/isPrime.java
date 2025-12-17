public class isPrime {
    public static void main(String[] args) {
        int n = 11;
        if (checkPrime(n)) {
            System.out.println("given number is prime");
        } else {
            System.out.println("given number is not prime");
        }

    }

    public static boolean checkPrime(int n) {
        if (n <= 1)
            return false;
        else if (n == 2 || n == 3)
            return true;
        else if (n % 2 == 0)
            return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
