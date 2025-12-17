public class q9 {
    public static void main(String[] args) {
        int num = 32567;
        int cou = 0;
        int res = count(num, cou);
        System.out.println(res);
    }

    public static int count(int num, int cou) {
        if (num <= 9) {
            return 1;
        }
        return 1 + count(num / 10, cou);

    }

}
