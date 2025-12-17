public class countFactor {
    public static void main(String[] args) {
        int n = 28;
        count(n);
    }

    public static void count(int n) {
        if (n == 1) {
            System.out.println(1);
            System.out.println("total factor is 1");
            return;
        }
        System.out.println(1 +" "+ n);
        int count = 2;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                int fact1 = i;
                int fact2 = n / i;
                if (fact1 != fact2) {
                    System.out.println(fact1 + " " + fact2);
                    count += 2;
                } else {
                    System.out.println(fact1);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
