
public class q12 {
    public static void main(String[] args) {
        int n=7;
        int n1=0;
        int n2=1;
        int i=0;

        while(i<=n){
            System.out.println(n1+" ");
            //  first method
            // int n3=n1+n2;
            // n1=n2;
            // n2=n3;

            // second method
            n2 = n1+n2;
            n1=n2-n1;
            i++;
        }
    }
    
}
