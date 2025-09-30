
public class adddigit {
    public static void main(String[] args) {
         int sum =0;
        int sum2=0;
        int sum3=0;
        while(num>0){
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        while(sum>0){
                int rem2=sum%10;
                sum2+=rem2;
                sum/=10;
            
        }
        while(sum2>0){
                int rem3=sum2%10;
                sum3+=rem3;
                sum2/=10;
            
        }
        return sum3;
    }
}
