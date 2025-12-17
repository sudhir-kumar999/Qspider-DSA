public class isPerfect {
    public static void main(String[] args) {
        int n = 288;
        if(checkPerfect(n)){
            System.out.println(n + " is a perfect number");
        }else{
            System.out.println(n + " is not a perfect number");
        }
    }

    public static boolean checkPerfect(int n){
        if(n<6){
            return false;
        }
        int sum = 1;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                int fact1 = i;
                int fact2= n/i;
                if(fact1!=fact2){
                    sum=sum+fact1+fact2;
                }
                else{
                    return false;
                }
            }
        }
        return n==sum;
    }
    
}
