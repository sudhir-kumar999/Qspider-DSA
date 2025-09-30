
public class q11 {
    public static void main(String[] args) {
        int n = 437353463;
        int countZero = 0;
        while(n>0){
            int rem = n%10;
            if(rem==3){
                countZero++;
            }
            n/=10;
        }
        System.out.println(countZero);
    }
    
}
