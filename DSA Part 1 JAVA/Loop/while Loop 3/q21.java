public class q21 {
    public static void main(String[] args) {
        int n = 25968;
        int prev = n % 10;
        boolean inc = false;
        n /= 10;
        while (n > 0) {
            int next = n % 10;
            if (prev > next) {
                inc = true;

            } else {
                inc = false;
                break;
            }
            prev = next;
            n /= 10;

        }
        if (inc == true) {
            System.out.println("number is in increasing order");
        } else {
            System.out.println("number is not in decreasing order");
        }
    }

}
