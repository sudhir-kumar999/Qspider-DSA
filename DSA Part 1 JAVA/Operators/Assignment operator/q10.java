
public class q10 {
    public static void main(String[] args) {
        // sum of three digit without loop
        int n = 123;
        int first = n % 10;
        n = n / 10;
        int second = n % 10;
        n=n/10;
        int third = n % 10;

        System.out.println(first+second+third);
        
    }

}
