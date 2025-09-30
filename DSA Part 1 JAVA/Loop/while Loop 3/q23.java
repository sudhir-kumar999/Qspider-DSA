public class q23 {
    public static void main(String[] args) {
        int n = 765227;
        int prev = n % 10;
        boolean inc = false;
        n /= 10;
        while (n > 0) {
            int next = n % 10;
            if (prev == next) {
                inc = true;
                break;

            } else {
                inc = false;
                
            }
            prev = next;
            n /= 10;

        }
        if (inc == true) {
            System.out.println("number is not different adjacent digit");
        } else {
            System.out.println("number is different adjacent digit order");
        }
    }

}
