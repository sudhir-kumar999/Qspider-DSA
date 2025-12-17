
public class q5 {
    public static void main(String[] args) {
        int start = 20;
        int end = 200;
        // int count =0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i) && isPrime(getSum(i))) {
                // count++;
                System.out.println(i);

            }
        }
        // System.out.println("total prime number is "+count);

    }

    public static int getSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n /= 10;
        }
        return sum;
    }

    public static boolean isPrime(int n) {
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
