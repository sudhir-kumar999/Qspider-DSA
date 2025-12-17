//  strong number har digit ke factorial ka sum us number ke brabar hota hai
public class q11 {
    public static void main(String[] args) {
        int n = 145;
        if (isStrong(n)) {
            System.out.println("strong number");
        } else {
            System.out.println("not strong");
        }

    }

    public static boolean isStrong(int n) {
        int sum = 0;
        int original = n;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + getFact(rem);
            n /= 10;

            if (original == sum) {
                return true;
            }
        }
        return false;
    }

    public static int getFact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

}
