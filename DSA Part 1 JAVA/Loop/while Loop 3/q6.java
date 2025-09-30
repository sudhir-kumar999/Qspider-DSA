
public class q6 {
    public static void main(String[] args) {
        int n = 42375;
        int big = 0;
        int small = 9;
        while (n > 0) {
            int rem = n % 10;
            if (rem > big) {
                big = rem;
            }
            if (rem < small) {
                small = rem;
            }
            n /= 10;

        }
        int substract = big - small;
        System.out.println(substract);
        // System.out.println(big);
        // System.out.println(small);
    }

}
