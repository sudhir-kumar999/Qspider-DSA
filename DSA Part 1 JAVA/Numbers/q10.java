
public class q10 {
    public static void main(String[] args) {
        int n = 208;
        if (isPerfect(n)) {
            System.out.println("perfect");
        } else {
            System.out.println("not perfect");
        }

    }

    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum = sum + i;
                if (sum == n) {
                    return true;
                }
            }
        }
        return false;
    }

}
