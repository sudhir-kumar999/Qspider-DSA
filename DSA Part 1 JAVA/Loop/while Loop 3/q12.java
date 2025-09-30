
public class q12 {
    public static void main(String[] args) {
        int n = 430705;
        int countZero = 0;
        while(n>0){
            int rem = n%10;
            if(rem%2==0){
                countZero++;
            }
            n/=10;
        }
        System.out.println(countZero);
    }
    
}
