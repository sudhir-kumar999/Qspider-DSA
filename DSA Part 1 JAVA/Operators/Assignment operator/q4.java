
public class q4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        // with using fourth variable

        // int d = a;
        // a = c;
        // c = b;
        // b = d;

        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);

        // without using fourth variable
        a = a + b + c;
        b = a - (c + b);
        c = c - b;
        a = a - (b + c);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}
