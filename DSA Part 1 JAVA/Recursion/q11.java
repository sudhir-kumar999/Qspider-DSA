public class q11 {
    public static void main(String[] args) {
        int num = 32564;
        int res = reverse(num, 0);
        System.out.println(res);
    }

    public static int reverse(int num, int rev) {
        if (num == 0) {
            return rev;
        }
        int last = num % 10;
        rev =rev* 10 + last;

        return reverse(num / 10, rev);

    }

}
