public class q13 {
    public static void main(String[] args) {
        int n = 7;
        int n1 = 0;
        int n2 = 1;
        int i = 0;
        while (i < 7) {
            
            n2 = n1 + n2;
            n1 = n2 - n1;
            
            i++;
            
        }
        System.out.println(n1);
    }
}
