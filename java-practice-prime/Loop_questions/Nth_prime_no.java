
public class Nth_prime_no {
    public static boolean prime(int num) {
        if (num < 2) {
            return false;
        } else if (num == 2 || num == 3) {
            return true;
        } else if (num % 2 == 0) {
            return false;
        }

        for (int i = 3; i < num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // boolean res=prime(2);
        // System.out.println(res);
        int count = 0;
        int range = 15;
        int target = 6;
        for (int i = 0; i <= range; i++) {
            if (prime(i)) {
                count++;
                if (count == target) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
