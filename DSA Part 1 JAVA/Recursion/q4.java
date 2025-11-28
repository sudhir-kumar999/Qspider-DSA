
public class q4 {
    public static void main(String[] args) {
        int sum = 0;
        int res = printsum(1, sum);
        System.out.println(res);

    }

    public static int printsum(int n, int sum) {
        if (n > 100) {
            return sum;
        }
        sum += n;
        return printsum(n + 1, sum);
         
    }

}

